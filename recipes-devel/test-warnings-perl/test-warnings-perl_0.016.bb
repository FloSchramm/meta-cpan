DESCRIPTION = "If you've ever tried to use Test::NoWarnings to confirm there are no \
warnings generated by your tests, combined with the convenience of \
"done_testing" to not have to declare a test count, you'll have \
discovered \
that these two features do not play well together, as the test count \
will be \
calculated *before* the warnings test is run, resulting in a TAP error. \
(See \
"examples/test_nowarnings.pl" in this distribution for a \
demonstration.)"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Warnings"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/E/ET/ETHER/Test-Warnings-0.016.tar.gz"

SRC_URI[md5sum] = "5608b3f8dbdd65d0251200754d97863a"
SRC_URI[sha256sum] = "09ebc9afa29eb4d1d44fbd974dfcd52e0a2d9ce7ec3e3ee7602394157831aba9"

S = "${WORKDIR}/Test-Warnings-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
