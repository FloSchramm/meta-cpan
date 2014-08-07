DESCRIPTION = "A good style of Perl programming calls for a lot of diverse regression \
tests."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Warn"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS += "sub-uplevel-perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/C/CH/CHORNY/Test-Warn-0.30.tar.gz"

SRC_URI[md5sum] = "8306b998a96d2cc69266b5248d550472"
SRC_URI[sha256sum] = "8197555b94189d919349a03f7058f83861f145af9bee59f505bfe47562144e41"

S = "${WORKDIR}/Test-Warn-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
