FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI:append:rpi = " \
    file://mcp251863-can-spi0.dts \
    file://pps-gpio-overlay.dts \
    file://pps.cfg \
"
DEPENDS += "dtc-native"

do_compile:append:rpi() {
    dtc -@ -I dts -O dtb -o ${B}/mcp251863-can-spi0.dtbo ${WORKDIR}/sources/mcp251863-can-spi0.dts
    dtc -@ -I dts -O dtb -o ${B}/pps-gpio-overlay.dtbo ${WORKDIR}/sources/pps-gpio-overlay.dts
}

do_install:append:rpi() {
    install -m 0644 ${B}/mcp251863-can-spi0.dtbo ${D}/boot/
    install -m 0644 ${B}/pps-gpio-overlay.dtbo ${D}/boot/
}

do_deploy:append:rpi() {
    install -m 0644 ${B}/mcp251863-can-spi0.dtbo ${DEPLOYDIR}/
    install -m 0644 ${B}/pps-gpio-overlay.dtbo ${DEPLOYDIR}/
}

# Enable kernel modules needed for CAN and SPI
KERNEL_MODULE_AUTOLOAD += "can can-dev can-raw mcp251xfd spi-bcm2835"
