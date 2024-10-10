SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Custom image extending core-image-fullcmd"
LICENSE = "MIT"

IMAGE_FEATURES += "splash ssh-server-openssh"

IMAGE_INSTALL += " \
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    wpa-supplicant \
    dhcpcd \
    inetutils \
    net-tools \
    coreutils \
    util-linux \
    bash \
    screen \
    tmux \
    xterm \
    nano \
    vim \
    git \
    python3 \
    python3-pip \
    curl \
    openssh \
    which \
    man-db \
    inetutils-ping \
    sysfsutils \
    kmod \
    procps \
    linux-firmware \
    ntp \
    gcc \
    autoconf \
    strace \
"

inherit core-image

python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*  Junt layer                                 *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}

addtask display_banner before do_build
