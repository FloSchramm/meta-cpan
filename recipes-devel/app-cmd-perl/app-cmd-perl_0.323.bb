DESCRIPTION = "write command line apps with less suffering"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/App-Cmd"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS += "capture-tiny-perl"
DEPENDS += "class-load-perl"
DEPENDS += "data-optlist-perl"
DEPENDS += "getopt-long-descriptive-perl"
DEPENDS += "io-tiecombine-perl"
DEPENDS += "perl"
DEPENDS += "string-rewriteprefix-perl"
DEPENDS += "sub-exporter-perl"
DEPENDS += "sub-install-perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RJ/RJBS/App-Cmd-0.323.tar.gz"

SRC_URI[md5sum] = "2542e858a359b3ecdc8d2e7c60595902"
SRC_URI[sha256sum] = "6d8e2837728f76154d277d98f8facfa5615676a4ee124bc7b818aa63337cd215"

S = "${WORKDIR}/App-Cmd-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
