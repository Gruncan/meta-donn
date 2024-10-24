FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://defconfig"

do_configure:append() {
    echo "# CONFIG_SWAP is not set" >> ${S}/.config
}

