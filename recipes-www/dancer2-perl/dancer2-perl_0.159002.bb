DESCRIPTION = "Dancer2 is the new generation of Dancer, the lightweight web-framework \
for Perl. Dancer2 is a complete rewrite based on Moo."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Dancer2"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/X/XS/XSAWYERX/Dancer2-0.159002.tar.gz"

SRC_URI[md5sum] = "e4d7317ea303a49aa4bcecd9f3880535"
SRC_URI[sha256sum] = "de6a0749d9df80c0c147aeb117d0fe3deb2291cbe711d23120cffb12bb0d8f71"
RDEPENDS_${PN} += "app-cmd-perl"
RDEPENDS_${PN} += "class-load-perl"
RDEPENDS_${PN} += "config-any-perl"
RDEPENDS_${PN} += "file-sharedir-perl"
RDEPENDS_${PN} += "hash-merge-simple-perl"
RDEPENDS_${PN} += "http-body-perl"
RDEPENDS_${PN} += "http-date-perl"
RDEPENDS_${PN} += "http-message-perl"
RDEPENDS_${PN} += "import-into-perl"
RDEPENDS_${PN} += "json-perl"
RDEPENDS_${PN} += "libwww-perl-perl"
RDEPENDS_${PN} += "mime-types-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "moo-perl"
RDEPENDS_${PN} += "moox-types-mooselike-perl"
RDEPENDS_${PN} += "plack-middleware-fixmissingbodyinredirect-perl"
RDEPENDS_${PN} += "plack-middleware-removeredundantbody-perl"
RDEPENDS_${PN} += "plack-perl"
RDEPENDS_${PN} += "return-multilevel-perl"
RDEPENDS_${PN} += "role-tiny-perl"
RDEPENDS_${PN} += "safe-isa-perl"
RDEPENDS_${PN} += "template-tiny-perl"
RDEPENDS_${PN} += "template-toolkit-perl"
RDEPENDS_${PN} += "try-tiny-perl"
RDEPENDS_${PN} += "yaml-perl"
RRECOMMENDS_${PN} += "cgi-deurl-xs-perl"
RRECOMMENDS_${PN} += "crypt-urandom-perl"
RRECOMMENDS_${PN} += "math-random-isaac-xs-perl"
RRECOMMENDS_${PN} += "scope-upper-perl"
RRECOMMENDS_${PN} += "url-encode-xs-perl"
DEPENDS += "capture-tiny-perl-native"
DEPENDS += "file-sharedir-install-perl-native"
DEPENDS += "http-cookies-perl-native"
DEPENDS += "perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-memory-cycle-perl-native"
DEPENDS += "test-mocktime-perl-native"

S = "${WORKDIR}/Dancer2-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"