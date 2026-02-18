SUMMARY = "Track repository for Rapid Laptimer"
DESCRIPTION = "Track data files for the Rapid Laptimer application"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/mFlorianW/rapid-tracks.git;protocol=https;branch=main"
SRCREV = "${AUTOREV}"
PV = "1.0.0+git${SRCREV}"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_PREFIX=/root/.local/rapid"

inherit cmake allarch

FILES:${PN} += "/root/.local"
