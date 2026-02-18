# Enable SPI and add MCP251863 CAN controller overlay
do_deploy:append() {
    # Enable SPI interface
    echo "dtparam=spi=on" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt

    # Load MCP251863 CAN controller overlay
    echo "dtoverlay=mcp251863-can-spi0" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
}
