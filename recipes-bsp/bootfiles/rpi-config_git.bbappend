do_deploy:append() {
    echo "core_freq=250" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
    echo "enable_uart=1" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
    echo "dtparam=spi=on" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
    echo "dtoverlay=disable-bt" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
    echo "dtoverlay=mcp251863-can-spi0" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
    echo "dtoverlay=pps-gpio-overlay" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
}
