# Copyright (c) 2020-2022 LG Electronics, Inc.

SUMMARY = "webOS extension for qtbase plugins"
AUTHOR = "Elvis Lee <kwangwoong.lee@lge.com>"
SECTION = "webos/base"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=89aea4e17d99a7cacdbeed46a0096b10 \
    file://oss-pkg-info.yaml;md5=3f3152217d6f7d50567ddadebe5f22a2 \
"

DEPENDS = "qtbase"

WEBOS_VERSION = "1.0.0-11_2f4b435c79dc99e5add85cb658a49aff54420faf"
PR = "r4"

inherit webos_qmake6
inherit webos_enhanced_submissions
inherit webos_public_repo
inherit webos_machine_impl_dep
inherit webos_qt_global

SRC_URI = "${WEBOSOSE_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"

EXTRA_QMAKEVARS_PRE += "${PACKAGECONFIG_CONFARGS}"
PACKAGECONFIG ??= ""

# Emulator
PACKAGECONFIG[emulator] = "CONFIG+=emulator,,nyx-lib"
PACKAGECONFIG_append_emulator = " emulator"
SRC_URI_append_emulator = " \
    file://0001-virtual-touch-for-emulator.patch \
"

# Multi-plane composition
PACKAGECONFIG[plane-composition] = "CONFIG+=plane_composition,,"

# EGL Protected content
PACKAGECONFIG[egl-protected-content] = "CONFIG+=egl_protected_content,,"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS}/ \
"
