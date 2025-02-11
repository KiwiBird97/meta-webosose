# Copyright (c) 2017-2021 LG Electronics, Inc.

# You don't need to change this value when you're changing just a RDEPENDS_${PN} variable.
EXTENDPRAUTO_append_rpi = "webosrpi8"

# gst omx is used only for raspberrypi builds
MEDIA_append_rpi = " \
    gstreamer1.0-omx \
"
# Until build issues caused by PLAT-44962 are fixed in PLAT-45700
MEDIA_raspberrypi3-64 = ""

RDEPENDS_${PN}_append_rpi = " \
    com.webos.service.audiofocusmanager \
    com.webos.service.audiooutput \
    com.webos.service.hfp \
    com.webos.service.location \
    com.webos.service.mediaindexer \
    com.webos.service.peripheralmanager \
    com.webos.service.power2 \
    ofono \
    resize-rootfs \
"

# TODO move this part to webOS FOTA service (not yet developped) later
RDEPENDS_${PN}_append_rpi_sota = " \
    u-boot-fw-utils \
"
