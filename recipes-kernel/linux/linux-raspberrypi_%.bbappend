FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI:append:rpi = " file://mcp251863-can-spi0.dts"
DEPENDS += "dtc-native"

do_compile:append:rpi() {
    dtc -@ -I dts -O dtb -o ${B}/mcp251863-can-spi0.dtbo ${WORKDIR}/sources/mcp251863-can-spi0.dts
}

do_install:append:rpi() {
    install -m 0644 ${B}/mcp251863-can-spi0.dtbo ${D}/boot/
}

do_deploy:append:rpi() {
    install -m 0644 ${B}/mcp251863-can-spi0.dtbo ${DEPLOYDIR}/
}

FILES:${PN} += "/boot/overlays/mcp251863-can-spi0.dtbo"

# Enable kernel modules needed for CAN and SPI
KERNEL_MODULE_AUTOLOAD += "can can-dev can-raw mcp251xfd spi-bcm2835"
