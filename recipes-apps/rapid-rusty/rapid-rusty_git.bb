LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSES/GPL-2.0-or-later.txt;md5=3d26203303a722dedc6bf909d95ba815"

SRC_URI = " \
    git://github.com/mFlorianW/rapid-rusty.git;protocol=https;branch=develop \
"
SRCREV = "${AUTOREV}"
PV = "0.9.0+git${SRCREV}"

S = "${WORKDIR}/git"

inherit cargo

RDEPENDS:${PN} += " \
    gpsd \
"
