DESCRIPTION = "This module provides a "clone()" method which makes recursive copies of \
nested hash, array, scalar and reference types, including tied \
variables and \
objects."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Clone"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GARU/Clone-0.37.tar.gz"

SRC_URI[md5sum] = "b0c9d1bcf9e85ab2fbc0b436cfc801f5"
SRC_URI[sha256sum] = "d9f251e6f01deaac3d29df1b8422b83dca972af999cd3f6ae456e0fc6f87cd9d"

S = "${WORKDIR}/Clone-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
