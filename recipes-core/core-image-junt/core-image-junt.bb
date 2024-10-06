SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Custom image extending core-image-fullcmd"
LICENSE = "MIT"

IMAGE_INSTALL += " \
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
    golang \
    gcc \
"

inherit core-image-full-cmdline

python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*  Example recipe created by bitbake-layers   *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}

addtask display_banner before do_build
