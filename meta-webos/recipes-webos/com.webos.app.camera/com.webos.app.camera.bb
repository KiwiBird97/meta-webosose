# Copyright (c) 2021 LG Electronics, Inc.

SUMMARY = "Camera application"
AUTHOR = "Muniraju <muniraju.a@lge.com>"
SECTION = "webos/apps"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = " \
file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
file://oss-pkg-info.yaml;md5=3072ffcf5bdbbc376ed21c9d378d14d5 \
"

WEBOS_VERSION = "0.0.1-1_34b7629927a2eeb6eeb3db7563184136e3ea2213"
PR = "r0"

inherit webos_component
inherit webos_enhanced_submissions
inherit webos_enactjs_app
inherit webos_public_repo

WEBOS_ENACTJS_SHRINKWRAP_OVERRIDE = "false"

SRC_URI = "${WEBOSOSE_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"

WEBOS_ENACTJS_APP_ID = "com.webos.app.camera"
