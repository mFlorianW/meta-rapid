SUMMARY = "A image that contains rapid and start it automatically."

IMAGE_INSTALL:append = " \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    ${MACHINE_EXTRA_RRECOMMENDS} \
    packagegroup-core-boot \
    rapid-runtime \
"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE:append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "", d)}"
IMAGE_BOOT_FILES:append:rpi = " mcp251863-can-spi0.dtbo;overlays/mcp251863-can-spi0.dtbo"
IMAGE_BOOT_FILES:append:rpi = " pps-gpio-overlay.dtbo;overlays/pps-gpio-overlay.dtbo"
