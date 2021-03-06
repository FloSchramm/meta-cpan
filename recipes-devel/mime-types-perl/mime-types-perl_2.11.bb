DESCRIPTION = "MIME types are used in many applications (for instance as part of \
e-mail and HTTP traffic) to indicate the type of content which is transmitted \
or expected. See RFC2045 at https://www.ietf.org/rfc/rfc2045.txt"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MIME-Types"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MARKOV/MIME-Types-2.11.tar.gz"

SRC_URI[md5sum] = "f9b354b7d16c4b6a4d40744fcc208484"
SRC_URI[sha256sum] = "8c51fd21d5c5c5b3469672faeb76caa02c77f537a3139e018ffed0e521956dec"

S = "${WORKDIR}/MIME-Types-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
