# 2015-03-23
SRCREV = "b0aad7dd4fad8d7e2e2f877a511a637258949597"
require rust-git.inc

SRC_URI_append = "\
	file://0001-libstd-io-process-Command-fully-quote-and-escape-the.patch \
	file://0002-std-io-process-add-Debug-tests.patch \
	file://0003-platform.mk-avoid-choking-on-i586.patch \
	file://0004-Target-add-default-target.json-path-libdir-rust-targ.patch \
	file://0005-mk-for-stage0-use-RUSTFLAGS-to-override-target-libs-.patch \
	file://0006-mk-add-missing-CFG_LIBDIR_RELATIVE.patch \
	file://0007-configure-support-bindir-and-extend-libdir-to-non-bl.patch \
	file://0008-Parallelize-submake-invocations.patch \
	file://0009-std-thread_local-workaround-for-NULL-__dso_handle.patch \
	file://0010-configure-install-support-disabling-calling-of-ldcon.patch \
	file://0011-mk-install-use-disable-rewrite-paths.patch \
	file://0012-filesearch-add-info-to-show-path-searching.patch \
\
	file://rust-installer/0001-add-option-to-disable-rewriting-of-install-paths.patch;patchdir=src/rust-installer \
"
#file://0013-filesearch-fix-for-new-path.patch \
