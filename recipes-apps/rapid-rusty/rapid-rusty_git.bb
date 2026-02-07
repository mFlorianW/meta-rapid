LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSES/GPL-2.0-or-later.txt;md5=3d26203303a722dedc6bf909d95ba815"

inherit cargo

RDEPENDS:${PN} += " \
    gpsd \
"

SRC_URI = " \
    git://github.com/mFlorianW/rapid-rusty.git;protocol=https;branch=develop \
    crate://crates.io/addr2line/0.24.2 \
    crate://crates.io/adler2/2.0.0 \
    crate://crates.io/aho-corasick/1.1.4 \
    crate://crates.io/android-tzdata/0.1.1 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/anstream/0.6.21 \
    crate://crates.io/anstyle/1.0.13 \
    crate://crates.io/anstyle-parse/0.2.7 \
    crate://crates.io/anstyle-query/1.1.4 \
    crate://crates.io/anstyle-wincon/3.0.10 \
    crate://crates.io/async-stream/0.3.6 \
    crate://crates.io/async-stream-impl/0.3.6 \
    crate://crates.io/async-trait/0.1.88 \
    crate://crates.io/atomic/0.5.3 \
    crate://crates.io/atomic/0.6.1 \
    crate://crates.io/atomic-waker/1.1.2 \
    crate://crates.io/autocfg/1.4.0 \
    crate://crates.io/backtrace/0.3.74 \
    crate://crates.io/base64/0.22.1 \
    crate://crates.io/binascii/0.1.4 \
    crate://crates.io/bitflags/2.10.0 \
    crate://crates.io/block-buffer/0.10.4 \
    crate://crates.io/block2/0.6.2 \
    crate://crates.io/bumpalo/3.17.0 \
    crate://crates.io/bytemuck/1.24.0 \
    crate://crates.io/byteorder/1.5.0 \
    crate://crates.io/bytes/1.10.1 \
    crate://crates.io/cc/1.2.19 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/cfg_aliases/0.2.1 \
    crate://crates.io/chrono/0.4.40 \
    crate://crates.io/clap/4.5.51 \
    crate://crates.io/clap_builder/4.5.51 \
    crate://crates.io/clap_derive/4.5.49 \
    crate://crates.io/clap_lex/0.7.6 \
    crate://crates.io/colorchoice/1.0.4 \
    crate://crates.io/cookie/0.18.1 \
    crate://crates.io/core-foundation/0.9.4 \
    crate://crates.io/core-foundation-sys/0.8.7 \
    crate://crates.io/cpufeatures/0.2.17 \
    crate://crates.io/crypto-common/0.1.7 \
    crate://crates.io/csv/1.4.0 \
    crate://crates.io/csv-core/0.1.13 \
    crate://crates.io/ctrlc/3.5.1 \
    crate://crates.io/dashmap/5.5.3 \
    crate://crates.io/data-encoding/2.9.0 \
    crate://crates.io/deranged/0.5.5 \
    crate://crates.io/devise/0.4.2 \
    crate://crates.io/devise_codegen/0.4.2 \
    crate://crates.io/devise_core/0.4.2 \
    crate://crates.io/digest/0.10.7 \
    crate://crates.io/dirs/6.0.0 \
    crate://crates.io/dirs-sys/0.5.0 \
    crate://crates.io/dispatch2/0.3.0 \
    crate://crates.io/displaydoc/0.2.5 \
    crate://crates.io/either/1.15.0 \
    crate://crates.io/encoding_rs/0.8.35 \
    crate://crates.io/env_filter/0.1.4 \
    crate://crates.io/env_logger/0.11.8 \
    crate://crates.io/equivalent/1.0.2 \
    crate://crates.io/errno/0.3.14 \
    crate://crates.io/fastrand/2.3.0 \
    crate://crates.io/figment/0.10.19 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/form_urlencoded/1.2.2 \
    crate://crates.io/futures/0.3.31 \
    crate://crates.io/futures-channel/0.3.31 \
    crate://crates.io/futures-core/0.3.31 \
    crate://crates.io/futures-executor/0.3.31 \
    crate://crates.io/futures-io/0.3.31 \
    crate://crates.io/futures-macro/0.3.31 \
    crate://crates.io/futures-sink/0.3.31 \
    crate://crates.io/futures-task/0.3.31 \
    crate://crates.io/futures-util/0.3.31 \
    crate://crates.io/generator/0.7.5 \
    crate://crates.io/generic-array/0.14.7 \
    crate://crates.io/getrandom/0.2.16 \
    crate://crates.io/getrandom/0.3.4 \
    crate://crates.io/gimli/0.31.1 \
    crate://crates.io/glob/0.3.3 \
    crate://crates.io/gpsd_proto/1.0.0 \
    crate://crates.io/h2/0.3.27 \
    crate://crates.io/h2/0.4.12 \
    crate://crates.io/hashbrown/0.14.5 \
    crate://crates.io/hashbrown/0.16.0 \
    crate://crates.io/heck/0.5.0 \
    crate://crates.io/hermit-abi/0.5.2 \
    crate://crates.io/http/0.2.12 \
    crate://crates.io/http/1.3.1 \
    crate://crates.io/http-body/0.4.6 \
    crate://crates.io/http-body/1.0.1 \
    crate://crates.io/http-body-util/0.1.3 \
    crate://crates.io/httparse/1.10.1 \
    crate://crates.io/httpdate/1.0.3 \
    crate://crates.io/hyper/0.14.32 \
    crate://crates.io/hyper/1.8.1 \
    crate://crates.io/hyper-rustls/0.27.7 \
    crate://crates.io/hyper-tls/0.6.0 \
    crate://crates.io/hyper-util/0.1.18 \
    crate://crates.io/iana-time-zone/0.1.63 \
    crate://crates.io/iana-time-zone-haiku/0.1.2 \
    crate://crates.io/icu_collections/2.1.1 \
    crate://crates.io/icu_locale_core/2.1.1 \
    crate://crates.io/icu_normalizer/2.1.1 \
    crate://crates.io/icu_normalizer_data/2.1.1 \
    crate://crates.io/icu_properties/2.1.1 \
    crate://crates.io/icu_properties_data/2.1.1 \
    crate://crates.io/icu_provider/2.1.1 \
    crate://crates.io/idna/1.1.0 \
    crate://crates.io/idna_adapter/1.2.1 \
    crate://crates.io/indexmap/2.12.0 \
    crate://crates.io/inlinable_string/0.1.15 \
    crate://crates.io/ipnet/2.11.0 \
    crate://crates.io/iri-string/0.7.9 \
    crate://crates.io/is-terminal/0.4.17 \
    crate://crates.io/is_terminal_polyfill/1.70.2 \
    crate://crates.io/itoa/1.0.15 \
    crate://crates.io/js-sys/0.3.77 \
    crate://crates.io/lazy_static/1.5.0 \
    crate://crates.io/libc/0.2.171 \
    crate://crates.io/libredox/0.1.10 \
    crate://crates.io/linux-raw-sys/0.11.0 \
    crate://crates.io/litemap/0.8.1 \
    crate://crates.io/lock_api/0.4.14 \
    crate://crates.io/log/0.4.27 \
    crate://crates.io/loom/0.5.6 \
    crate://crates.io/matchers/0.2.0 \
    crate://crates.io/memchr/2.7.4 \
    crate://crates.io/mime/0.3.17 \
    crate://crates.io/miniz_oxide/0.8.7 \
    crate://crates.io/mio/1.0.3 \
    crate://crates.io/multer/3.1.0 \
    crate://crates.io/native-tls/0.2.14 \
    crate://crates.io/nix/0.30.1 \
    crate://crates.io/nu-ansi-term/0.50.3 \
    crate://crates.io/num-conv/0.1.0 \
    crate://crates.io/num-traits/0.2.19 \
    crate://crates.io/num_cpus/1.17.0 \
    crate://crates.io/objc2/0.6.3 \
    crate://crates.io/objc2-encode/4.1.0 \
    crate://crates.io/object/0.36.7 \
    crate://crates.io/once_cell/1.21.3 \
    crate://crates.io/once_cell_polyfill/1.70.2 \
    crate://crates.io/openssl/0.10.75 \
    crate://crates.io/openssl-macros/0.1.1 \
    crate://crates.io/openssl-probe/0.1.6 \
    crate://crates.io/openssl-sys/0.9.111 \
    crate://crates.io/option-ext/0.2.0 \
    crate://crates.io/parking_lot/0.12.5 \
    crate://crates.io/parking_lot_core/0.9.12 \
    crate://crates.io/pear/0.2.9 \
    crate://crates.io/pear_codegen/0.2.9 \
    crate://crates.io/percent-encoding/2.3.2 \
    crate://crates.io/pin-project-lite/0.2.16 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.32 \
    crate://crates.io/potential_utf/0.1.4 \
    crate://crates.io/powerfmt/0.2.0 \
    crate://crates.io/ppv-lite86/0.2.21 \
    crate://crates.io/proc-macro2/1.0.94 \
    crate://crates.io/proc-macro2-diagnostics/0.10.1 \
    crate://crates.io/quote/1.0.40 \
    crate://crates.io/r-efi/5.3.0 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand/0.9.2 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_chacha/0.9.0 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/rand_core/0.9.3 \
    crate://crates.io/redox_syscall/0.5.18 \
    crate://crates.io/redox_users/0.5.2 \
    crate://crates.io/ref-cast/1.0.25 \
    crate://crates.io/ref-cast-impl/1.0.25 \
    crate://crates.io/regex-automata/0.4.13 \
    crate://crates.io/regex-syntax/0.8.8 \
    crate://crates.io/reqwest/0.12.24 \
    crate://crates.io/ring/0.17.14 \
    crate://crates.io/rocket/0.5.1 \
    crate://crates.io/rocket_codegen/0.5.1 \
    crate://crates.io/rocket_http/0.5.1 \
    crate://crates.io/rocket_ws/0.1.1 \
    crate://crates.io/rustc-demangle/0.1.24 \
    crate://crates.io/rustix/1.1.2 \
    crate://crates.io/rustls/0.23.35 \
    crate://crates.io/rustls-pki-types/1.13.0 \
    crate://crates.io/rustls-webpki/0.103.8 \
    crate://crates.io/rustversion/1.0.20 \
    crate://crates.io/ryu/1.0.20 \
    crate://crates.io/schannel/0.1.28 \
    crate://crates.io/scoped-tls/1.0.1 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/security-framework/2.11.1 \
    crate://crates.io/security-framework-sys/2.15.0 \
    crate://crates.io/serde/1.0.228 \
    crate://crates.io/serde_core/1.0.228 \
    crate://crates.io/serde_derive/1.0.228 \
    crate://crates.io/serde_json/1.0.140 \
    crate://crates.io/serde_spanned/0.6.9 \
    crate://crates.io/serde_urlencoded/0.7.1 \
    crate://crates.io/serial_test/2.0.0 \
    crate://crates.io/serial_test_derive/2.0.0 \
    crate://crates.io/sha1/0.10.6 \
    crate://crates.io/sharded-slab/0.1.7 \
    crate://crates.io/shlex/1.3.0 \
    crate://crates.io/signal-hook-registry/1.4.6 \
    crate://crates.io/slab/0.4.9 \
    crate://crates.io/smallvec/1.15.1 \
    crate://crates.io/socket2/0.5.9 \
    crate://crates.io/spin/0.9.8 \
    crate://crates.io/stable-pattern/0.1.0 \
    crate://crates.io/stable_deref_trait/1.2.1 \
    crate://crates.io/state/0.6.0 \
    crate://crates.io/strsim/0.11.1 \
    crate://crates.io/strum/0.27.2 \
    crate://crates.io/strum_macros/0.27.2 \
    crate://crates.io/subtle/2.6.1 \
    crate://crates.io/syn/2.0.100 \
    crate://crates.io/sync_wrapper/1.0.2 \
    crate://crates.io/synstructure/0.13.2 \
    crate://crates.io/system-configuration/0.6.1 \
    crate://crates.io/system-configuration-sys/0.6.0 \
    crate://crates.io/tempfile/3.23.0 \
    crate://crates.io/test-log/0.2.18 \
    crate://crates.io/test-log-macros/0.2.18 \
    crate://crates.io/thiserror/1.0.69 \
    crate://crates.io/thiserror/2.0.17 \
    crate://crates.io/thiserror-impl/1.0.69 \
    crate://crates.io/thiserror-impl/2.0.17 \
    crate://crates.io/thread_local/1.1.9 \
    crate://crates.io/time/0.3.44 \
    crate://crates.io/time-core/0.1.6 \
    crate://crates.io/time-macros/0.2.24 \
    crate://crates.io/tinystr/0.8.2 \
    crate://crates.io/tokio/1.44.2 \
    crate://crates.io/tokio-macros/2.5.0 \
    crate://crates.io/tokio-native-tls/0.3.1 \
    crate://crates.io/tokio-rustls/0.26.4 \
    crate://crates.io/tokio-stream/0.1.17 \
    crate://crates.io/tokio-tungstenite/0.21.0 \
    crate://crates.io/tokio-tungstenite/0.28.0 \
    crate://crates.io/tokio-util/0.7.14 \
    crate://crates.io/toml/0.8.23 \
    crate://crates.io/toml_datetime/0.6.11 \
    crate://crates.io/toml_edit/0.22.27 \
    crate://crates.io/toml_write/0.1.2 \
    crate://crates.io/tower/0.5.2 \
    crate://crates.io/tower-http/0.6.6 \
    crate://crates.io/tower-layer/0.3.3 \
    crate://crates.io/tower-service/0.3.3 \
    crate://crates.io/tracing/0.1.41 \
    crate://crates.io/tracing-attributes/0.1.30 \
    crate://crates.io/tracing-core/0.1.34 \
    crate://crates.io/tracing-log/0.2.0 \
    crate://crates.io/tracing-subscriber/0.3.20 \
    crate://crates.io/try-lock/0.2.5 \
    crate://crates.io/tungstenite/0.21.0 \
    crate://crates.io/tungstenite/0.28.0 \
    crate://crates.io/typenum/1.19.0 \
    crate://crates.io/ubyte/0.10.4 \
    crate://crates.io/uncased/0.9.10 \
    crate://crates.io/unicode-ident/1.0.18 \
    crate://crates.io/unicode-xid/0.2.6 \
    crate://crates.io/untrusted/0.9.0 \
    crate://crates.io/url/2.5.7 \
    crate://crates.io/utf-8/0.7.6 \
    crate://crates.io/utf8_iter/1.0.4 \
    crate://crates.io/utf8parse/0.2.2 \
    crate://crates.io/utm/0.1.6 \
    crate://crates.io/valuable/0.1.1 \
    crate://crates.io/vcpkg/0.2.15 \
    crate://crates.io/version_check/0.9.5 \
    crate://crates.io/want/0.3.1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasip2/1.0.1+wasi-0.2.4 \
    crate://crates.io/wasm-bindgen/0.2.100 \
    crate://crates.io/wasm-bindgen-backend/0.2.100 \
    crate://crates.io/wasm-bindgen-futures/0.4.50 \
    crate://crates.io/wasm-bindgen-macro/0.2.100 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.100 \
    crate://crates.io/wasm-bindgen-shared/0.2.100 \
    crate://crates.io/web-sys/0.3.77 \
    crate://crates.io/windows/0.48.0 \
    crate://crates.io/windows-core/0.61.0 \
    crate://crates.io/windows-implement/0.60.0 \
    crate://crates.io/windows-interface/0.59.1 \
    crate://crates.io/windows-link/0.1.1 \
    crate://crates.io/windows-link/0.2.1 \
    crate://crates.io/windows-registry/0.6.1 \
    crate://crates.io/windows-result/0.3.2 \
    crate://crates.io/windows-result/0.4.1 \
    crate://crates.io/windows-strings/0.4.0 \
    crate://crates.io/windows-strings/0.5.1 \
    crate://crates.io/windows-sys/0.52.0 \
    crate://crates.io/windows-sys/0.60.2 \
    crate://crates.io/windows-sys/0.61.2 \
    crate://crates.io/windows-targets/0.48.5 \
    crate://crates.io/windows-targets/0.52.6 \
    crate://crates.io/windows-targets/0.53.5 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.5 \
    crate://crates.io/windows_aarch64_gnullvm/0.52.6 \
    crate://crates.io/windows_aarch64_gnullvm/0.53.1 \
    crate://crates.io/windows_aarch64_msvc/0.48.5 \
    crate://crates.io/windows_aarch64_msvc/0.52.6 \
    crate://crates.io/windows_aarch64_msvc/0.53.1 \
    crate://crates.io/windows_i686_gnu/0.48.5 \
    crate://crates.io/windows_i686_gnu/0.52.6 \
    crate://crates.io/windows_i686_gnu/0.53.1 \
    crate://crates.io/windows_i686_gnullvm/0.52.6 \
    crate://crates.io/windows_i686_gnullvm/0.53.1 \
    crate://crates.io/windows_i686_msvc/0.48.5 \
    crate://crates.io/windows_i686_msvc/0.52.6 \
    crate://crates.io/windows_i686_msvc/0.53.1 \
    crate://crates.io/windows_x86_64_gnu/0.48.5 \
    crate://crates.io/windows_x86_64_gnu/0.52.6 \
    crate://crates.io/windows_x86_64_gnu/0.53.1 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.5 \
    crate://crates.io/windows_x86_64_gnullvm/0.52.6 \
    crate://crates.io/windows_x86_64_gnullvm/0.53.1 \
    crate://crates.io/windows_x86_64_msvc/0.48.5 \
    crate://crates.io/windows_x86_64_msvc/0.52.6 \
    crate://crates.io/windows_x86_64_msvc/0.53.1 \
    crate://crates.io/winnow/0.7.13 \
    crate://crates.io/wit-bindgen/0.46.0 \
    crate://crates.io/writeable/0.6.2 \
    crate://crates.io/yansi/1.0.1 \
    crate://crates.io/yoke/0.8.1 \
    crate://crates.io/yoke-derive/0.8.1 \
    crate://crates.io/zerocopy/0.8.27 \
    crate://crates.io/zerocopy-derive/0.8.27 \
    crate://crates.io/zerofrom/0.1.6 \
    crate://crates.io/zerofrom-derive/0.1.6 \
    crate://crates.io/zeroize/1.8.2 \
    crate://crates.io/zerotrie/0.2.3 \
    crate://crates.io/zerovec/0.11.5 \
    crate://crates.io/zerovec-derive/0.11.2 \
"

# Add checksums:

SRC_URI[addr2line-0.24.2.sha256sum] = "dfbe277e56a376000877090da837660b4427aad530e3028d44e0bffe4f89a1c1"
SRC_URI[adler2-2.0.0.sha256sum] = "512761e0bb2578dd7380c6baaa0f4ce03e84f95e960231d1dec8bf4d7d6e2627"
SRC_URI[aho-corasick-1.1.4.sha256sum] = "ddd31a130427c27518df266943a5308ed92d4b226cc639f5a8f1002816174301"
SRC_URI[android-tzdata-0.1.1.sha256sum] = "e999941b234f3131b00bc13c22d06e8c5ff726d1b6318ac7eb276997bbb4fef0"
SRC_URI[android_system_properties-0.1.5.sha256sum] = "819e7219dbd41043ac279b19830f2efc897156490d7fd6ea916720117ee66311"
SRC_URI[anstream-0.6.21.sha256sum] = "43d5b281e737544384e969a5ccad3f1cdd24b48086a0fc1b2a5262a26b8f4f4a"
SRC_URI[anstyle-1.0.13.sha256sum] = "5192cca8006f1fd4f7237516f40fa183bb07f8fbdfedaa0036de5ea9b0b45e78"
SRC_URI[anstyle-parse-0.2.7.sha256sum] = "4e7644824f0aa2c7b9384579234ef10eb7efb6a0deb83f9630a49594dd9c15c2"
SRC_URI[anstyle-query-1.1.4.sha256sum] = "9e231f6134f61b71076a3eab506c379d4f36122f2af15a9ff04415ea4c3339e2"
SRC_URI[anstyle-wincon-3.0.10.sha256sum] = "3e0633414522a32ffaac8ac6cc8f748e090c5717661fddeea04219e2344f5f2a"
SRC_URI[async-stream-0.3.6.sha256sum] = "0b5a71a6f37880a80d1d7f19efd781e4b5de42c88f0722cc13bcb6cc2cfe8476"
SRC_URI[async-stream-impl-0.3.6.sha256sum] = "c7c24de15d275a1ecfd47a380fb4d5ec9bfe0933f309ed5e705b775596a3574d"
SRC_URI[async-trait-0.1.88.sha256sum] = "e539d3fca749fcee5236ab05e93a52867dd549cc157c8cb7f99595f3cedffdb5"
SRC_URI[atomic-0.5.3.sha256sum] = "c59bdb34bc650a32731b31bd8f0829cc15d24a708ee31559e0bb34f2bc320cba"
SRC_URI[atomic-0.6.1.sha256sum] = "a89cbf775b137e9b968e67227ef7f775587cde3fd31b0d8599dbd0f598a48340"
SRC_URI[atomic-waker-1.1.2.sha256sum] = "1505bd5d3d116872e7271a6d4e16d81d0c8570876c8de68093a09ac269d8aac0"
SRC_URI[autocfg-1.4.0.sha256sum] = "ace50bade8e6234aa140d9a2f552bbee1db4d353f69b8217bc503490fc1a9f26"
SRC_URI[backtrace-0.3.74.sha256sum] = "8d82cb332cdfaed17ae235a638438ac4d4839913cc2af585c3c6746e8f8bee1a"
SRC_URI[base64-0.22.1.sha256sum] = "72b3254f16251a8381aa12e40e3c4d2f0199f8c6508fbecb9d91f575e0fbb8c6"
SRC_URI[binascii-0.1.4.sha256sum] = "383d29d513d8764dcdc42ea295d979eb99c3c9f00607b3692cf68a431f7dca72"
SRC_URI[bitflags-2.10.0.sha256sum] = "812e12b5285cc515a9c72a5c1d3b6d46a19dac5acfef5265968c166106e31dd3"
SRC_URI[block-buffer-0.10.4.sha256sum] = "3078c7629b62d3f0439517fa394996acacc5cbc91c5a20d8c658e77abd503a71"
SRC_URI[block2-0.6.2.sha256sum] = "cdeb9d870516001442e364c5220d3574d2da8dc765554b4a617230d33fa58ef5"
SRC_URI[bumpalo-3.17.0.sha256sum] = "1628fb46dfa0b37568d12e5edd512553eccf6a22a78e8bde00bb4aed84d5bdbf"
SRC_URI[bytemuck-1.24.0.sha256sum] = "1fbdf580320f38b612e485521afda1ee26d10cc9884efaaa750d383e13e3c5f4"
SRC_URI[byteorder-1.5.0.sha256sum] = "1fd0f2584146f6f2ef48085050886acf353beff7305ebd1ae69500e27c67f64b"
SRC_URI[bytes-1.10.1.sha256sum] = "d71b6127be86fdcfddb610f7182ac57211d4b18a3e9c82eb2d17662f2227ad6a"
SRC_URI[cc-1.2.19.sha256sum] = "8e3a13707ac958681c13b39b458c073d0d9bc8a22cb1b2f4c8e55eb72c13f362"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[cfg_aliases-0.2.1.sha256sum] = "613afe47fcd5fac7ccf1db93babcb082c5994d996f20b8b159f2ad1658eb5724"
SRC_URI[chrono-0.4.40.sha256sum] = "1a7964611d71df112cb1730f2ee67324fcf4d0fc6606acbbe9bfe06df124637c"
SRC_URI[clap-4.5.51.sha256sum] = "4c26d721170e0295f191a69bd9a1f93efcdb0aff38684b61ab5750468972e5f5"
SRC_URI[clap_builder-4.5.51.sha256sum] = "75835f0c7bf681bfd05abe44e965760fea999a5286c6eb2d59883634fd02011a"
SRC_URI[clap_derive-4.5.49.sha256sum] = "2a0b5487afeab2deb2ff4e03a807ad1a03ac532ff5a2cee5d86884440c7f7671"
SRC_URI[clap_lex-0.7.6.sha256sum] = "a1d728cc89cf3aee9ff92b05e62b19ee65a02b5702cff7d5a377e32c6ae29d8d"
SRC_URI[colorchoice-1.0.4.sha256sum] = "b05b61dc5112cbb17e4b6cd61790d9845d13888356391624cbe7e41efeac1e75"
SRC_URI[cookie-0.18.1.sha256sum] = "4ddef33a339a91ea89fb53151bd0a4689cfce27055c291dfa69945475d22c747"
SRC_URI[core-foundation-0.9.4.sha256sum] = "91e195e091a93c46f7102ec7818a2aa394e1e1771c3ab4825963fa03e45afb8f"
SRC_URI[core-foundation-sys-0.8.7.sha256sum] = "773648b94d0e5d620f64f280777445740e61fe701025087ec8b57f45c791888b"
SRC_URI[cpufeatures-0.2.17.sha256sum] = "59ed5838eebb26a2bb2e58f6d5b5316989ae9d08bab10e0e6d103e656d1b0280"
SRC_URI[crypto-common-0.1.7.sha256sum] = "78c8292055d1c1df0cce5d180393dc8cce0abec0a7102adb6c7b1eef6016d60a"
SRC_URI[csv-1.4.0.sha256sum] = "52cd9d68cf7efc6ddfaaee42e7288d3a99d613d4b50f76ce9827ae0c6e14f938"
SRC_URI[csv-core-0.1.13.sha256sum] = "704a3c26996a80471189265814dbc2c257598b96b8a7feae2d31ace646bb9782"
SRC_URI[ctrlc-3.5.1.sha256sum] = "73736a89c4aff73035ba2ed2e565061954da00d4970fc9ac25dcc85a2a20d790"
SRC_URI[dashmap-5.5.3.sha256sum] = "978747c1d849a7d2ee5e8adc0159961c48fb7e5db2f06af6723b80123bb53856"
SRC_URI[data-encoding-2.9.0.sha256sum] = "2a2330da5de22e8a3cb63252ce2abb30116bf5265e89c0e01bc17015ce30a476"
SRC_URI[deranged-0.5.5.sha256sum] = "ececcb659e7ba858fb4f10388c250a7252eb0a27373f1a72b8748afdd248e587"
SRC_URI[devise-0.4.2.sha256sum] = "f1d90b0c4c777a2cad215e3c7be59ac7c15adf45cf76317009b7d096d46f651d"
SRC_URI[devise_codegen-0.4.2.sha256sum] = "71b28680d8be17a570a2334922518be6adc3f58ecc880cbb404eaeb8624fd867"
SRC_URI[devise_core-0.4.2.sha256sum] = "b035a542cf7abf01f2e3c4d5a7acbaebfefe120ae4efc7bde3df98186e4b8af7"
SRC_URI[digest-0.10.7.sha256sum] = "9ed9a281f7bc9b7576e61468ba615a66a5c8cfdff42420a70aa82701a3b1e292"
SRC_URI[dirs-6.0.0.sha256sum] = "c3e8aa94d75141228480295a7d0e7feb620b1a5ad9f12bc40be62411e38cce4e"
SRC_URI[dirs-sys-0.5.0.sha256sum] = "e01a3366d27ee9890022452ee61b2b63a67e6f13f58900b651ff5665f0bb1fab"
SRC_URI[dispatch2-0.3.0.sha256sum] = "89a09f22a6c6069a18470eb92d2298acf25463f14256d24778e1230d789a2aec"
SRC_URI[displaydoc-0.2.5.sha256sum] = "97369cbbc041bc366949bc74d34658d6cda5621039731c6310521892a3a20ae0"
SRC_URI[either-1.15.0.sha256sum] = "48c757948c5ede0e46177b7add2e67155f70e33c07fea8284df6576da70b3719"
SRC_URI[encoding_rs-0.8.35.sha256sum] = "75030f3c4f45dafd7586dd6780965a8c7e8e285a5ecb86713e63a79c5b2766f3"
SRC_URI[env_filter-0.1.4.sha256sum] = "1bf3c259d255ca70051b30e2e95b5446cdb8949ac4cd22c0d7fd634d89f568e2"
SRC_URI[env_logger-0.11.8.sha256sum] = "13c863f0904021b108aa8b2f55046443e6b1ebde8fd4a15c399893aae4fa069f"
SRC_URI[equivalent-1.0.2.sha256sum] = "877a4ace8713b0bcf2a4e7eec82529c029f1d0619886d18145fea96c3ffe5c0f"
SRC_URI[errno-0.3.14.sha256sum] = "39cab71617ae0d63f51a36d69f866391735b51691dbda63cf6f96d042b63efeb"
SRC_URI[fastrand-2.3.0.sha256sum] = "37909eebbb50d72f9059c3b6d82c0463f2ff062c9e95845c43a6c9c0355411be"
SRC_URI[figment-0.10.19.sha256sum] = "8cb01cd46b0cf372153850f4c6c272d9cbea2da513e07538405148f95bd789f3"
SRC_URI[fnv-1.0.7.sha256sum] = "3f9eec918d3f24069decb9af1554cad7c880e2da24a9afd88aca000531ab82c1"
SRC_URI[foreign-types-0.3.2.sha256sum] = "f6f339eb8adc052cd2ca78910fda869aefa38d22d5cb648e6485e4d3fc06f3b1"
SRC_URI[foreign-types-shared-0.1.1.sha256sum] = "00b0228411908ca8685dba7fc2cdd70ec9990a6e753e89b6ac91a84c40fbaf4b"
SRC_URI[form_urlencoded-1.2.2.sha256sum] = "cb4cb245038516f5f85277875cdaa4f7d2c9a0fa0468de06ed190163b1581fcf"
SRC_URI[futures-0.3.31.sha256sum] = "65bc07b1a8bc7c85c5f2e110c476c7389b4554ba72af57d8445ea63a576b0876"
SRC_URI[futures-channel-0.3.31.sha256sum] = "2dff15bf788c671c1934e366d07e30c1814a8ef514e1af724a602e8a2fbe1b10"
SRC_URI[futures-core-0.3.31.sha256sum] = "05f29059c0c2090612e8d742178b0580d2dc940c837851ad723096f87af6663e"
SRC_URI[futures-executor-0.3.31.sha256sum] = "1e28d1d997f585e54aebc3f97d39e72338912123a67330d723fdbb564d646c9f"
SRC_URI[futures-io-0.3.31.sha256sum] = "9e5c1b78ca4aae1ac06c48a526a655760685149f0d465d21f37abfe57ce075c6"
SRC_URI[futures-macro-0.3.31.sha256sum] = "162ee34ebcb7c64a8abebc059ce0fee27c2262618d7b60ed8faf72fef13c3650"
SRC_URI[futures-sink-0.3.31.sha256sum] = "e575fab7d1e0dcb8d0c7bcf9a63ee213816ab51902e6d244a95819acacf1d4f7"
SRC_URI[futures-task-0.3.31.sha256sum] = "f90f7dce0722e95104fcb095585910c0977252f286e354b5e3bd38902cd99988"
SRC_URI[futures-util-0.3.31.sha256sum] = "9fa08315bb612088cc391249efdc3bc77536f16c91f6cf495e6fbe85b20a4a81"
SRC_URI[generator-0.7.5.sha256sum] = "5cc16584ff22b460a382b7feec54b23d2908d858152e5739a120b949293bd74e"
SRC_URI[generic-array-0.14.7.sha256sum] = "85649ca51fd72272d7821adaf274ad91c288277713d9c18820d8499a7ff69e9a"
SRC_URI[getrandom-0.2.16.sha256sum] = "335ff9f135e4384c8150d6f27c6daed433577f86b4750418338c01a1a2528592"
SRC_URI[getrandom-0.3.4.sha256sum] = "899def5c37c4fd7b2664648c28120ecec138e4d395b459e5ca34f9cce2dd77fd"
SRC_URI[gimli-0.31.1.sha256sum] = "07e28edb80900c19c28f1072f2e8aeca7fa06b23cd4169cefe1af5aa3260783f"
SRC_URI[glob-0.3.3.sha256sum] = "0cc23270f6e1808e30a928bdc84dea0b9b4136a8bc82338574f23baf47bbd280"
SRC_URI[gpsd_proto-1.0.0.sha256sum] = "247df1fffe6bc378377d6cf894dac08aef2194a6c1c9e2f173c3c10979fa5ca5"
SRC_URI[h2-0.3.27.sha256sum] = "0beca50380b1fc32983fc1cb4587bfa4bb9e78fc259aad4a0032d2080309222d"
SRC_URI[h2-0.4.12.sha256sum] = "f3c0b69cfcb4e1b9f1bf2f53f95f766e4661169728ec61cd3fe5a0166f2d1386"
SRC_URI[hashbrown-0.14.5.sha256sum] = "e5274423e17b7c9fc20b6e7e208532f9b19825d82dfd615708b70edd83df41f1"
SRC_URI[hashbrown-0.16.0.sha256sum] = "5419bdc4f6a9207fbeba6d11b604d481addf78ecd10c11ad51e76c2f6482748d"
SRC_URI[heck-0.5.0.sha256sum] = "2304e00983f87ffb38b55b444b5e3b60a884b5d30c0fca7d82fe33449bbe55ea"
SRC_URI[hermit-abi-0.5.2.sha256sum] = "fc0fef456e4baa96da950455cd02c081ca953b141298e41db3fc7e36b1da849c"
SRC_URI[http-0.2.12.sha256sum] = "601cbb57e577e2f5ef5be8e7b83f0f63994f25aa94d673e54a92d5c516d101f1"
SRC_URI[http-1.3.1.sha256sum] = "f4a85d31aea989eead29a3aaf9e1115a180df8282431156e533de47660892565"
SRC_URI[http-body-0.4.6.sha256sum] = "7ceab25649e9960c0311ea418d17bee82c0dcec1bd053b5f9a66e265a693bed2"
SRC_URI[http-body-1.0.1.sha256sum] = "1efedce1fb8e6913f23e0c92de8e62cd5b772a67e7b3946df930a62566c93184"
SRC_URI[http-body-util-0.1.3.sha256sum] = "b021d93e26becf5dc7e1b75b1bed1fd93124b374ceb73f43d4d4eafec896a64a"
SRC_URI[httparse-1.10.1.sha256sum] = "6dbf3de79e51f3d586ab4cb9d5c3e2c14aa28ed23d180cf89b4df0454a69cc87"
SRC_URI[httpdate-1.0.3.sha256sum] = "df3b46402a9d5adb4c86a0cf463f42e19994e3ee891101b1841f30a545cb49a9"
SRC_URI[hyper-0.14.32.sha256sum] = "41dfc780fdec9373c01bae43289ea34c972e40ee3c9f6b3c8801a35f35586ce7"
SRC_URI[hyper-1.8.1.sha256sum] = "2ab2d4f250c3d7b1c9fcdff1cece94ea4e2dfbec68614f7b87cb205f24ca9d11"
SRC_URI[hyper-rustls-0.27.7.sha256sum] = "e3c93eb611681b207e1fe55d5a71ecf91572ec8a6705cdb6857f7d8d5242cf58"
SRC_URI[hyper-tls-0.6.0.sha256sum] = "70206fc6890eaca9fde8a0bf71caa2ddfc9fe045ac9e5c70df101a7dbde866e0"
SRC_URI[hyper-util-0.1.18.sha256sum] = "52e9a2a24dc5c6821e71a7030e1e14b7b632acac55c40e9d2e082c621261bb56"
SRC_URI[iana-time-zone-0.1.63.sha256sum] = "b0c919e5debc312ad217002b8048a17b7d83f80703865bbfcfebb0458b0b27d8"
SRC_URI[iana-time-zone-haiku-0.1.2.sha256sum] = "f31827a206f56af32e590ba56d5d2d085f558508192593743f16b2306495269f"
SRC_URI[icu_collections-2.1.1.sha256sum] = "4c6b649701667bbe825c3b7e6388cb521c23d88644678e83c0c4d0a621a34b43"
SRC_URI[icu_locale_core-2.1.1.sha256sum] = "edba7861004dd3714265b4db54a3c390e880ab658fec5f7db895fae2046b5bb6"
SRC_URI[icu_normalizer-2.1.1.sha256sum] = "5f6c8828b67bf8908d82127b2054ea1b4427ff0230ee9141c54251934ab1b599"
SRC_URI[icu_normalizer_data-2.1.1.sha256sum] = "7aedcccd01fc5fe81e6b489c15b247b8b0690feb23304303a9e560f37efc560a"
SRC_URI[icu_properties-2.1.1.sha256sum] = "e93fcd3157766c0c8da2f8cff6ce651a31f0810eaa1c51ec363ef790bbb5fb99"
SRC_URI[icu_properties_data-2.1.1.sha256sum] = "02845b3647bb045f1100ecd6480ff52f34c35f82d9880e029d329c21d1054899"
SRC_URI[icu_provider-2.1.1.sha256sum] = "85962cf0ce02e1e0a629cc34e7ca3e373ce20dda4c4d7294bbd0bf1fdb59e614"
SRC_URI[idna-1.1.0.sha256sum] = "3b0875f23caa03898994f6ddc501886a45c7d3d62d04d2d90788d47be1b1e4de"
SRC_URI[idna_adapter-1.2.1.sha256sum] = "3acae9609540aa318d1bc588455225fb2085b9ed0c4f6bd0d9d5bcd86f1a0344"
SRC_URI[indexmap-2.12.0.sha256sum] = "6717a8d2a5a929a1a2eb43a12812498ed141a0bcfb7e8f7844fbdbe4303bba9f"
SRC_URI[inlinable_string-0.1.15.sha256sum] = "c8fae54786f62fb2918dcfae3d568594e50eb9b5c25bf04371af6fe7516452fb"
SRC_URI[ipnet-2.11.0.sha256sum] = "469fb0b9cefa57e3ef31275ee7cacb78f2fdca44e4765491884a2b119d4eb130"
SRC_URI[iri-string-0.7.9.sha256sum] = "4f867b9d1d896b67beb18518eda36fdb77a32ea590de864f1325b294a6d14397"
SRC_URI[is-terminal-0.4.17.sha256sum] = "3640c1c38b8e4e43584d8df18be5fc6b0aa314ce6ebf51b53313d4306cca8e46"
SRC_URI[is_terminal_polyfill-1.70.2.sha256sum] = "a6cb138bb79a146c1bd460005623e142ef0181e3d0219cb493e02f7d08a35695"
SRC_URI[itoa-1.0.15.sha256sum] = "4a5f13b858c8d314ee3e8f639011f7ccefe71f97f96e50151fb991f267928e2c"
SRC_URI[js-sys-0.3.77.sha256sum] = "1cfaf33c695fc6e08064efbc1f72ec937429614f25eef83af942d0e227c3a28f"
SRC_URI[lazy_static-1.5.0.sha256sum] = "bbd2bcb4c963f2ddae06a2efc7e9f3591312473c50c6685e1f298068316e66fe"
SRC_URI[libc-0.2.171.sha256sum] = "c19937216e9d3aa9956d9bb8dfc0b0c8beb6058fc4f7a4dc4d850edf86a237d6"
SRC_URI[libredox-0.1.10.sha256sum] = "416f7e718bdb06000964960ffa43b4335ad4012ae8b99060261aa4a8088d5ccb"
SRC_URI[linux-raw-sys-0.11.0.sha256sum] = "df1d3c3b53da64cf5760482273a98e575c651a67eec7f77df96b5b642de8f039"
SRC_URI[litemap-0.8.1.sha256sum] = "6373607a59f0be73a39b6fe456b8192fcc3585f602af20751600e974dd455e77"
SRC_URI[lock_api-0.4.14.sha256sum] = "224399e74b87b5f3557511d98dff8b14089b3dadafcab6bb93eab67d3aace965"
SRC_URI[log-0.4.27.sha256sum] = "13dc2df351e3202783a1fe0d44375f7295ffb4049267b0f3018346dc122a1d94"
SRC_URI[loom-0.5.6.sha256sum] = "ff50ecb28bb86013e935fb6683ab1f6d3a20016f123c76fd4c27470076ac30f5"
SRC_URI[matchers-0.2.0.sha256sum] = "d1525a2a28c7f4fa0fc98bb91ae755d1e2d1505079e05539e35bc876b5d65ae9"
SRC_URI[memchr-2.7.4.sha256sum] = "78ca9ab1a0babb1e7d5695e3530886289c18cf2f87ec19a575a0abdce112e3a3"
SRC_URI[mime-0.3.17.sha256sum] = "6877bb514081ee2a7ff5ef9de3281f14a4dd4bceac4c09388074a6b5df8a139a"
SRC_URI[miniz_oxide-0.8.7.sha256sum] = "ff70ce3e48ae43fa075863cef62e8b43b71a4f2382229920e0df362592919430"
SRC_URI[mio-1.0.3.sha256sum] = "2886843bf800fba2e3377cff24abf6379b4c4d5c6681eaf9ea5b0d15090450bd"
SRC_URI[multer-3.1.0.sha256sum] = "83e87776546dc87511aa5ee218730c92b666d7264ab6ed41f9d215af9cd5224b"
SRC_URI[native-tls-0.2.14.sha256sum] = "87de3442987e9dbec73158d5c715e7ad9072fda936bb03d19d7fa10e00520f0e"
SRC_URI[nix-0.30.1.sha256sum] = "74523f3a35e05aba87a1d978330aef40f67b0304ac79c1c00b294c9830543db6"
SRC_URI[nu-ansi-term-0.50.3.sha256sum] = "7957b9740744892f114936ab4a57b3f487491bbeafaf8083688b16841a4240e5"
SRC_URI[num-conv-0.1.0.sha256sum] = "51d515d32fb182ee37cda2ccdcb92950d6a3c2893aa280e540671c2cd0f3b1d9"
SRC_URI[num-traits-0.2.19.sha256sum] = "071dfc062690e90b734c0b2273ce72ad0ffa95f0c74596bc250dcfd960262841"
SRC_URI[num_cpus-1.17.0.sha256sum] = "91df4bbde75afed763b708b7eee1e8e7651e02d97f6d5dd763e89367e957b23b"
SRC_URI[objc2-0.6.3.sha256sum] = "b7c2599ce0ec54857b29ce62166b0ed9b4f6f1a70ccc9a71165b6154caca8c05"
SRC_URI[objc2-encode-4.1.0.sha256sum] = "ef25abbcd74fb2609453eb695bd2f860d389e457f67dc17cafc8b8cbc89d0c33"
SRC_URI[object-0.36.7.sha256sum] = "62948e14d923ea95ea2c7c86c71013138b66525b86bdc08d2dcc262bdb497b87"
SRC_URI[once_cell-1.21.3.sha256sum] = "42f5e15c9953c5e4ccceeb2e7382a716482c34515315f7b03532b8b4e8393d2d"
SRC_URI[once_cell_polyfill-1.70.2.sha256sum] = "384b8ab6d37215f3c5301a95a4accb5d64aa607f1fcb26a11b5303878451b4fe"
SRC_URI[openssl-0.10.75.sha256sum] = "08838db121398ad17ab8531ce9de97b244589089e290a384c900cb9ff7434328"
SRC_URI[openssl-macros-0.1.1.sha256sum] = "a948666b637a0f465e8564c73e89d4dde00d72d4d473cc972f390fc3dcee7d9c"
SRC_URI[openssl-probe-0.1.6.sha256sum] = "d05e27ee213611ffe7d6348b942e8f942b37114c00cc03cec254295a4a17852e"
SRC_URI[openssl-sys-0.9.111.sha256sum] = "82cab2d520aa75e3c58898289429321eb788c3106963d0dc886ec7a5f4adc321"
SRC_URI[option-ext-0.2.0.sha256sum] = "04744f49eae99ab78e0d5c0b603ab218f515ea8cfe5a456d7629ad883a3b6e7d"
SRC_URI[parking_lot-0.12.5.sha256sum] = "93857453250e3077bd71ff98b6a65ea6621a19bb0f559a85248955ac12c45a1a"
SRC_URI[parking_lot_core-0.9.12.sha256sum] = "2621685985a2ebf1c516881c026032ac7deafcda1a2c9b7850dc81e3dfcb64c1"
SRC_URI[pear-0.2.9.sha256sum] = "bdeeaa00ce488657faba8ebf44ab9361f9365a97bd39ffb8a60663f57ff4b467"
SRC_URI[pear_codegen-0.2.9.sha256sum] = "4bab5b985dc082b345f812b7df84e1bef27e7207b39e448439ba8bd69c93f147"
SRC_URI[percent-encoding-2.3.2.sha256sum] = "9b4f627cb1b25917193a259e49bdad08f671f8d9708acfd5fe0a8c1455d87220"
SRC_URI[pin-project-lite-0.2.16.sha256sum] = "3b3cff922bd51709b605d9ead9aa71031d81447142d828eb4a6eba76fe619f9b"
SRC_URI[pin-utils-0.1.0.sha256sum] = "8b870d8c151b6f2fb93e84a13146138f05d02ed11c7e7c54f8826aaaf7c9f184"
SRC_URI[pkg-config-0.3.32.sha256sum] = "7edddbd0b52d732b21ad9a5fab5c704c14cd949e5e9a1ec5929a24fded1b904c"
SRC_URI[potential_utf-0.1.4.sha256sum] = "b73949432f5e2a09657003c25bca5e19a0e9c84f8058ca374f49e0ebe605af77"
SRC_URI[powerfmt-0.2.0.sha256sum] = "439ee305def115ba05938db6eb1644ff94165c5ab5e9420d1c1bcedbba909391"
SRC_URI[ppv-lite86-0.2.21.sha256sum] = "85eae3c4ed2f50dcfe72643da4befc30deadb458a9b590d720cde2f2b1e97da9"
SRC_URI[proc-macro2-1.0.94.sha256sum] = "a31971752e70b8b2686d7e46ec17fb38dad4051d94024c88df49b667caea9c84"
SRC_URI[proc-macro2-diagnostics-0.10.1.sha256sum] = "af066a9c399a26e020ada66a034357a868728e72cd426f3adcd35f80d88d88c8"
SRC_URI[quote-1.0.40.sha256sum] = "1885c039570dc00dcb4ff087a89e185fd56bae234ddc7f056a945bf36467248d"
SRC_URI[r-efi-5.3.0.sha256sum] = "69cdb34c158ceb288df11e18b4bd39de994f6657d83847bdffdbd7f346754b0f"
SRC_URI[rand-0.8.5.sha256sum] = "34af8d1a0e25924bc5b7c43c079c942339d8f0a8b57c39049bef581b46327404"
SRC_URI[rand-0.9.2.sha256sum] = "6db2770f06117d490610c7488547d543617b21bfa07796d7a12f6f1bd53850d1"
SRC_URI[rand_chacha-0.3.1.sha256sum] = "e6c10a63a0fa32252be49d21e7709d4d4baf8d231c2dbce1eaa8141b9b127d88"
SRC_URI[rand_chacha-0.9.0.sha256sum] = "d3022b5f1df60f26e1ffddd6c66e8aa15de382ae63b3a0c1bfc0e4d3e3f325cb"
SRC_URI[rand_core-0.6.4.sha256sum] = "ec0be4795e2f6a28069bec0b5ff3e2ac9bafc99e6a9a7dc3547996c5c816922c"
SRC_URI[rand_core-0.9.3.sha256sum] = "99d9a13982dcf210057a8a78572b2217b667c3beacbf3a0d8b454f6f82837d38"
SRC_URI[redox_syscall-0.5.18.sha256sum] = "ed2bf2547551a7053d6fdfafda3f938979645c44812fbfcda098faae3f1a362d"
SRC_URI[redox_users-0.5.2.sha256sum] = "a4e608c6638b9c18977b00b475ac1f28d14e84b27d8d42f70e0bf1e3dec127ac"
SRC_URI[ref-cast-1.0.25.sha256sum] = "f354300ae66f76f1c85c5f84693f0ce81d747e2c3f21a45fef496d89c960bf7d"
SRC_URI[ref-cast-impl-1.0.25.sha256sum] = "b7186006dcb21920990093f30e3dea63b7d6e977bf1256be20c3563a5db070da"
SRC_URI[regex-automata-0.4.13.sha256sum] = "5276caf25ac86c8d810222b3dbb938e512c55c6831a10f3e6ed1c93b84041f1c"
SRC_URI[regex-syntax-0.8.8.sha256sum] = "7a2d987857b319362043e95f5353c0535c1f58eec5336fdfcf626430af7def58"
SRC_URI[reqwest-0.12.24.sha256sum] = "9d0946410b9f7b082a427e4ef5c8ff541a88b357bc6c637c40db3a68ac70a36f"
SRC_URI[ring-0.17.14.sha256sum] = "a4689e6c2294d81e88dc6261c768b63bc4fcdb852be6d1352498b114f61383b7"
SRC_URI[rocket-0.5.1.sha256sum] = "a516907296a31df7dc04310e7043b61d71954d703b603cc6867a026d7e72d73f"
SRC_URI[rocket_codegen-0.5.1.sha256sum] = "575d32d7ec1a9770108c879fc7c47815a80073f96ca07ff9525a94fcede1dd46"
SRC_URI[rocket_http-0.5.1.sha256sum] = "e274915a20ee3065f611c044bd63c40757396b6dbc057d6046aec27f14f882b9"
SRC_URI[rocket_ws-0.1.1.sha256sum] = "25f1877668c937b701177c349f21383c556cd3bb4ba8fa1d07fa96ccb3a8782e"
SRC_URI[rustc-demangle-0.1.24.sha256sum] = "719b953e2095829ee67db738b3bfa9fa368c94900df327b3f07fe6e794d2fe1f"
SRC_URI[rustix-1.1.2.sha256sum] = "cd15f8a2c5551a84d56efdc1cd049089e409ac19a3072d5037a17fd70719ff3e"
SRC_URI[rustls-0.23.35.sha256sum] = "533f54bc6a7d4f647e46ad909549eda97bf5afc1585190ef692b4286b198bd8f"
SRC_URI[rustls-pki-types-1.13.0.sha256sum] = "94182ad936a0c91c324cd46c6511b9510ed16af436d7b5bab34beab0afd55f7a"
SRC_URI[rustls-webpki-0.103.8.sha256sum] = "2ffdfa2f5286e2247234e03f680868ac2815974dc39e00ea15adc445d0aafe52"
SRC_URI[rustversion-1.0.20.sha256sum] = "eded382c5f5f786b989652c49544c4877d9f015cc22e145a5ea8ea66c2921cd2"
SRC_URI[ryu-1.0.20.sha256sum] = "28d3b2b1366ec20994f1fd18c3c594f05c5dd4bc44d8bb0c1c632c8d6829481f"
SRC_URI[schannel-0.1.28.sha256sum] = "891d81b926048e76efe18581bf793546b4c0eaf8448d72be8de2bbee5fd166e1"
SRC_URI[scoped-tls-1.0.1.sha256sum] = "e1cf6437eb19a8f4a6cc0f7dca544973b0b78843adbfeb3683d1a94a0024a294"
SRC_URI[scopeguard-1.2.0.sha256sum] = "94143f37725109f92c262ed2cf5e59bce7498c01bcc1502d7b9afe439a4e9f49"
SRC_URI[security-framework-2.11.1.sha256sum] = "897b2245f0b511c87893af39b033e5ca9cce68824c4d7e7630b5a1d339658d02"
SRC_URI[security-framework-sys-2.15.0.sha256sum] = "cc1f0cbffaac4852523ce30d8bd3c5cdc873501d96ff467ca09b6767bb8cd5c0"
SRC_URI[serde-1.0.228.sha256sum] = "9a8e94ea7f378bd32cbbd37198a4a91436180c5bb472411e48b5ec2e2124ae9e"
SRC_URI[serde_core-1.0.228.sha256sum] = "41d385c7d4ca58e59fc732af25c3983b67ac852c1a25000afe1175de458b67ad"
SRC_URI[serde_derive-1.0.228.sha256sum] = "d540f220d3187173da220f885ab66608367b6574e925011a9353e4badda91d79"
SRC_URI[serde_json-1.0.140.sha256sum] = "20068b6e96dc6c9bd23e01df8827e6c7e1f2fddd43c21810382803c136b99373"
SRC_URI[serde_spanned-0.6.9.sha256sum] = "bf41e0cfaf7226dca15e8197172c295a782857fcb97fad1808a166870dee75a3"
SRC_URI[serde_urlencoded-0.7.1.sha256sum] = "d3491c14715ca2294c4d6a88f15e84739788c1d030eed8c110436aafdaa2f3fd"
SRC_URI[serial_test-2.0.0.sha256sum] = "0e56dd856803e253c8f298af3f4d7eb0ae5e23a737252cd90bb4f3b435033b2d"
SRC_URI[serial_test_derive-2.0.0.sha256sum] = "91d129178576168c589c9ec973feedf7d3126c01ac2bf08795109aa35b69fb8f"
SRC_URI[sha1-0.10.6.sha256sum] = "e3bf829a2d51ab4a5ddf1352d8470c140cadc8301b2ae1789db023f01cedd6ba"
SRC_URI[sharded-slab-0.1.7.sha256sum] = "f40ca3c46823713e0d4209592e8d6e826aa57e928f09752619fc696c499637f6"
SRC_URI[shlex-1.3.0.sha256sum] = "0fda2ff0d084019ba4d7c6f371c95d8fd75ce3524c3cb8fb653a3023f6323e64"
SRC_URI[signal-hook-registry-1.4.6.sha256sum] = "b2a4719bff48cee6b39d12c020eeb490953ad2443b7055bd0b21fca26bd8c28b"
SRC_URI[slab-0.4.9.sha256sum] = "8f92a496fb766b417c996b9c5e57daf2f7ad3b0bebe1ccfca4856390e3d3bb67"
SRC_URI[smallvec-1.15.1.sha256sum] = "67b1b7a3b5fe4f1376887184045fcf45c69e92af734b7aaddc05fb777b6fbd03"
SRC_URI[socket2-0.5.9.sha256sum] = "4f5fd57c80058a56cf5c777ab8a126398ece8e442983605d280a44ce79d0edef"
SRC_URI[spin-0.9.8.sha256sum] = "6980e8d7511241f8acf4aebddbb1ff938df5eebe98691418c4468d0b72a96a67"
SRC_URI[stable-pattern-0.1.0.sha256sum] = "4564168c00635f88eaed410d5efa8131afa8d8699a612c80c455a0ba05c21045"
SRC_URI[stable_deref_trait-1.2.1.sha256sum] = "6ce2be8dc25455e1f91df71bfa12ad37d7af1092ae736f3a6cd0e37bc7810596"
SRC_URI[state-0.6.0.sha256sum] = "2b8c4a4445d81357df8b1a650d0d0d6fbbbfe99d064aa5e02f3e4022061476d8"
SRC_URI[strsim-0.11.1.sha256sum] = "7da8b5736845d9f2fcb837ea5d9e2628564b3b043a70948a3f0b778838c5fb4f"
SRC_URI[strum-0.27.2.sha256sum] = "af23d6f6c1a224baef9d3f61e287d2761385a5b88fdab4eb4c6f11aeb54c4bcf"
SRC_URI[strum_macros-0.27.2.sha256sum] = "7695ce3845ea4b33927c055a39dc438a45b059f7c1b3d91d38d10355fb8cbca7"
SRC_URI[subtle-2.6.1.sha256sum] = "13c2bddecc57b384dee18652358fb23172facb8a2c51ccc10d74c157bdea3292"
SRC_URI[syn-2.0.100.sha256sum] = "b09a44accad81e1ba1cd74a32461ba89dee89095ba17b32f5d03683b1b1fc2a0"
SRC_URI[sync_wrapper-1.0.2.sha256sum] = "0bf256ce5efdfa370213c1dabab5935a12e49f2c58d15e9eac2870d3b4f27263"
SRC_URI[synstructure-0.13.2.sha256sum] = "728a70f3dbaf5bab7f0c4b1ac8d7ae5ea60a4b5549c8a5914361c99147a709d2"
SRC_URI[system-configuration-0.6.1.sha256sum] = "3c879d448e9d986b661742763247d3693ed13609438cf3d006f51f5368a5ba6b"
SRC_URI[system-configuration-sys-0.6.0.sha256sum] = "8e1d1b10ced5ca923a1fcb8d03e96b8d3268065d724548c0211415ff6ac6bac4"
SRC_URI[tempfile-3.23.0.sha256sum] = "2d31c77bdf42a745371d260a26ca7163f1e0924b64afa0b688e61b5a9fa02f16"
SRC_URI[test-log-0.2.18.sha256sum] = "1e33b98a582ea0be1168eba097538ee8dd4bbe0f2b01b22ac92ea30054e5be7b"
SRC_URI[test-log-macros-0.2.18.sha256sum] = "451b374529930d7601b1eef8d32bc79ae870b6079b069401709c2a8bf9e75f36"
SRC_URI[thiserror-1.0.69.sha256sum] = "b6aaf5339b578ea85b50e080feb250a3e8ae8cfcdff9a461c9ec2904bc923f52"
SRC_URI[thiserror-2.0.17.sha256sum] = "f63587ca0f12b72a0600bcba1d40081f830876000bb46dd2337a3051618f4fc8"
SRC_URI[thiserror-impl-1.0.69.sha256sum] = "4fee6c4efc90059e10f81e6d42c60a18f76588c3d74cb83a0b242a2b6c7504c1"
SRC_URI[thiserror-impl-2.0.17.sha256sum] = "3ff15c8ecd7de3849db632e14d18d2571fa09dfc5ed93479bc4485c7a517c913"
SRC_URI[thread_local-1.1.9.sha256sum] = "f60246a4944f24f6e018aa17cdeffb7818b76356965d03b07d6a9886e8962185"
SRC_URI[time-0.3.44.sha256sum] = "91e7d9e3bb61134e77bde20dd4825b97c010155709965fedf0f49bb138e52a9d"
SRC_URI[time-core-0.1.6.sha256sum] = "40868e7c1d2f0b8d73e4a8c7f0ff63af4f6d19be117e90bd73eb1d62cf831c6b"
SRC_URI[time-macros-0.2.24.sha256sum] = "30cfb0125f12d9c277f35663a0a33f8c30190f4e4574868a330595412d34ebf3"
SRC_URI[tinystr-0.8.2.sha256sum] = "42d3e9c45c09de15d06dd8acf5f4e0e399e85927b7f00711024eb7ae10fa4869"
SRC_URI[tokio-1.44.2.sha256sum] = "e6b88822cbe49de4185e3a4cbf8321dd487cf5fe0c5c65695fef6346371e9c48"
SRC_URI[tokio-macros-2.5.0.sha256sum] = "6e06d43f1345a3bcd39f6a56dbb7dcab2ba47e68e8ac134855e7e2bdbaf8cab8"
SRC_URI[tokio-native-tls-0.3.1.sha256sum] = "bbae76ab933c85776efabc971569dd6119c580d8f5d448769dec1764bf796ef2"
SRC_URI[tokio-rustls-0.26.4.sha256sum] = "1729aa945f29d91ba541258c8df89027d5792d85a8841fb65e8bf0f4ede4ef61"
SRC_URI[tokio-stream-0.1.17.sha256sum] = "eca58d7bba4a75707817a2c44174253f9236b2d5fbd055602e9d5c07c139a047"
SRC_URI[tokio-tungstenite-0.21.0.sha256sum] = "c83b561d025642014097b66e6c1bb422783339e0909e4429cde4749d1990bc38"
SRC_URI[tokio-tungstenite-0.28.0.sha256sum] = "d25a406cddcc431a75d3d9afc6a7c0f7428d4891dd973e4d54c56b46127bf857"
SRC_URI[tokio-util-0.7.14.sha256sum] = "6b9590b93e6fcc1739458317cccd391ad3955e2bde8913edf6f95f9e65a8f034"
SRC_URI[toml-0.8.23.sha256sum] = "dc1beb996b9d83529a9e75c17a1686767d148d70663143c7854d8b4a09ced362"
SRC_URI[toml_datetime-0.6.11.sha256sum] = "22cddaf88f4fbc13c51aebbf5f8eceb5c7c5a9da2ac40a13519eb5b0a0e8f11c"
SRC_URI[toml_edit-0.22.27.sha256sum] = "41fe8c660ae4257887cf66394862d21dbca4a6ddd26f04a3560410406a2f819a"
SRC_URI[toml_write-0.1.2.sha256sum] = "5d99f8c9a7727884afe522e9bd5edbfc91a3312b36a77b5fb8926e4c31a41801"
SRC_URI[tower-0.5.2.sha256sum] = "d039ad9159c98b70ecfd540b2573b97f7f52c3e8d9f8ad57a24b916a536975f9"
SRC_URI[tower-http-0.6.6.sha256sum] = "adc82fd73de2a9722ac5da747f12383d2bfdb93591ee6c58486e0097890f05f2"
SRC_URI[tower-layer-0.3.3.sha256sum] = "121c2a6cda46980bb0fcd1647ffaf6cd3fc79a013de288782836f6df9c48780e"
SRC_URI[tower-service-0.3.3.sha256sum] = "8df9b6e13f2d32c91b9bd719c00d1958837bc7dec474d94952798cc8e69eeec3"
SRC_URI[tracing-0.1.41.sha256sum] = "784e0ac535deb450455cbfa28a6f0df145ea1bb7ae51b821cf5e7927fdcfbdd0"
SRC_URI[tracing-attributes-0.1.30.sha256sum] = "81383ab64e72a7a8b8e13130c49e3dab29def6d0c7d76a03087b3cf71c5c6903"
SRC_URI[tracing-core-0.1.34.sha256sum] = "b9d12581f227e93f094d3af2ae690a574abb8a2b9b7a96e7cfe9647b2b617678"
SRC_URI[tracing-log-0.2.0.sha256sum] = "ee855f1f400bd0e5c02d150ae5de3840039a3f54b025156404e34c23c03f47c3"
SRC_URI[tracing-subscriber-0.3.20.sha256sum] = "2054a14f5307d601f88daf0553e1cbf472acc4f2c51afab632431cdcd72124d5"
SRC_URI[try-lock-0.2.5.sha256sum] = "e421abadd41a4225275504ea4d6566923418b7f05506fbc9c0fe86ba7396114b"
SRC_URI[tungstenite-0.21.0.sha256sum] = "9ef1a641ea34f399a848dea702823bbecfb4c486f911735368f1f137cb8257e1"
SRC_URI[tungstenite-0.28.0.sha256sum] = "8628dcc84e5a09eb3d8423d6cb682965dea9133204e8fb3efee74c2a0c259442"
SRC_URI[typenum-1.19.0.sha256sum] = "562d481066bde0658276a35467c4af00bdc6ee726305698a55b86e61d7ad82bb"
SRC_URI[ubyte-0.10.4.sha256sum] = "f720def6ce1ee2fc44d40ac9ed6d3a59c361c80a75a7aa8e75bb9baed31cf2ea"
SRC_URI[uncased-0.9.10.sha256sum] = "e1b88fcfe09e89d3866a5c11019378088af2d24c3fbd4f0543f96b479ec90697"
SRC_URI[unicode-ident-1.0.18.sha256sum] = "5a5f39404a5da50712a4c1eecf25e90dd62b613502b7e925fd4e4d19b5c96512"
SRC_URI[unicode-xid-0.2.6.sha256sum] = "ebc1c04c71510c7f702b52b7c350734c9ff1295c464a03335b00bb84fc54f853"
SRC_URI[untrusted-0.9.0.sha256sum] = "8ecb6da28b8a351d773b68d5825ac39017e680750f980f3a1a85cd8dd28a47c1"
SRC_URI[url-2.5.7.sha256sum] = "08bc136a29a3d1758e07a9cca267be308aeebf5cfd5a10f3f67ab2097683ef5b"
SRC_URI[utf-8-0.7.6.sha256sum] = "09cc8ee72d2a9becf2f2febe0205bbed8fc6615b7cb429ad062dc7b7ddd036a9"
SRC_URI[utf8_iter-1.0.4.sha256sum] = "b6c140620e7ffbb22c2dee59cafe6084a59b5ffc27a8859a5f0d494b5d52b6be"
SRC_URI[utf8parse-0.2.2.sha256sum] = "06abde3611657adf66d383f00b093d7faecc7fa57071cce2578660c9f1010821"
SRC_URI[utm-0.1.6.sha256sum] = "95b09e3b3a0abd1ccb77673a6b7b8875d9d1c80626154add451cf18392dc4c3c"
SRC_URI[valuable-0.1.1.sha256sum] = "ba73ea9cf16a25df0c8caa16c51acb937d5712a8429db78a3ee29d5dcacd3a65"
SRC_URI[vcpkg-0.2.15.sha256sum] = "accd4ea62f7bb7a82fe23066fb0957d48ef677f6eeb8215f372f52e48bb32426"
SRC_URI[version_check-0.9.5.sha256sum] = "0b928f33d975fc6ad9f86c8f283853ad26bdd5b10b7f1542aa2fa15e2289105a"
SRC_URI[want-0.3.1.sha256sum] = "bfa7760aed19e106de2c7c0b581b509f2f25d3dacaf737cb82ac61bc6d760b0e"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[wasip2-1.0.1+wasi-0.2.4.sha256sum] = "0562428422c63773dad2c345a1882263bbf4d65cf3f42e90921f787ef5ad58e7"
SRC_URI[wasm-bindgen-0.2.100.sha256sum] = "1edc8929d7499fc4e8f0be2262a241556cfc54a0bea223790e71446f2aab1ef5"
SRC_URI[wasm-bindgen-backend-0.2.100.sha256sum] = "2f0a0651a5c2bc21487bde11ee802ccaf4c51935d0d3d42a6101f98161700bc6"
SRC_URI[wasm-bindgen-futures-0.4.50.sha256sum] = "555d470ec0bc3bb57890405e5d4322cc9ea83cebb085523ced7be4144dac1e61"
SRC_URI[wasm-bindgen-macro-0.2.100.sha256sum] = "7fe63fc6d09ed3792bd0897b314f53de8e16568c2b3f7982f468c0bf9bd0b407"
SRC_URI[wasm-bindgen-macro-support-0.2.100.sha256sum] = "8ae87ea40c9f689fc23f209965b6fb8a99ad69aeeb0231408be24920604395de"
SRC_URI[wasm-bindgen-shared-0.2.100.sha256sum] = "1a05d73b933a847d6cccdda8f838a22ff101ad9bf93e33684f39c1f5f0eece3d"
SRC_URI[web-sys-0.3.77.sha256sum] = "33b6dd2ef9186f1f2072e409e99cd22a975331a6b3591b12c764e0e55c60d5d2"
SRC_URI[windows-0.48.0.sha256sum] = "e686886bc078bc1b0b600cac0147aadb815089b6e4da64016cbd754b6342700f"
SRC_URI[windows-core-0.61.0.sha256sum] = "4763c1de310c86d75a878046489e2e5ba02c649d185f21c67d4cf8a56d098980"
SRC_URI[windows-implement-0.60.0.sha256sum] = "a47fddd13af08290e67f4acabf4b459f647552718f683a7b415d290ac744a836"
SRC_URI[windows-interface-0.59.1.sha256sum] = "bd9211b69f8dcdfa817bfd14bf1c97c9188afa36f4750130fcdf3f400eca9fa8"
SRC_URI[windows-link-0.1.1.sha256sum] = "76840935b766e1b0a05c0066835fb9ec80071d4c09a16f6bd5f7e655e3c14c38"
SRC_URI[windows-link-0.2.1.sha256sum] = "f0805222e57f7521d6a62e36fa9163bc891acd422f971defe97d64e70d0a4fe5"
SRC_URI[windows-registry-0.6.1.sha256sum] = "02752bf7fbdcce7f2a27a742f798510f3e5ad88dbe84871e5168e2120c3d5720"
SRC_URI[windows-result-0.3.2.sha256sum] = "c64fd11a4fd95df68efcfee5f44a294fe71b8bc6a91993e2791938abcc712252"
SRC_URI[windows-result-0.4.1.sha256sum] = "7781fa89eaf60850ac3d2da7af8e5242a5ea78d1a11c49bf2910bb5a73853eb5"
SRC_URI[windows-strings-0.4.0.sha256sum] = "7a2ba9642430ee452d5a7aa78d72907ebe8cfda358e8cb7918a2050581322f97"
SRC_URI[windows-strings-0.5.1.sha256sum] = "7837d08f69c77cf6b07689544538e017c1bfcf57e34b4c0ff58e6c2cd3b37091"
SRC_URI[windows-sys-0.52.0.sha256sum] = "282be5f36a8ce781fad8c8ae18fa3f9beff57ec1b52cb3de0789201425d9a33d"
SRC_URI[windows-sys-0.60.2.sha256sum] = "f2f500e4d28234f72040990ec9d39e3a6b950f9f22d3dba18416c35882612bcb"
SRC_URI[windows-sys-0.61.2.sha256sum] = "ae137229bcbd6cdf0f7b80a31df61766145077ddf49416a728b02cb3921ff3fc"
SRC_URI[windows-targets-0.48.5.sha256sum] = "9a2fa6e2155d7247be68c096456083145c183cbbbc2764150dda45a87197940c"
SRC_URI[windows-targets-0.52.6.sha256sum] = "9b724f72796e036ab90c1021d4780d4d3d648aca59e491e6b98e725b84e99973"
SRC_URI[windows-targets-0.53.5.sha256sum] = "4945f9f551b88e0d65f3db0bc25c33b8acea4d9e41163edf90dcd0b19f9069f3"
SRC_URI[windows_aarch64_gnullvm-0.48.5.sha256sum] = "2b38e32f0abccf9987a4e3079dfb67dcd799fb61361e53e2882c3cbaf0d905d8"
SRC_URI[windows_aarch64_gnullvm-0.52.6.sha256sum] = "32a4622180e7a0ec044bb555404c800bc9fd9ec262ec147edd5989ccd0c02cd3"
SRC_URI[windows_aarch64_gnullvm-0.53.1.sha256sum] = "a9d8416fa8b42f5c947f8482c43e7d89e73a173cead56d044f6a56104a6d1b53"
SRC_URI[windows_aarch64_msvc-0.48.5.sha256sum] = "dc35310971f3b2dbbf3f0690a219f40e2d9afcf64f9ab7cc1be722937c26b4bc"
SRC_URI[windows_aarch64_msvc-0.52.6.sha256sum] = "09ec2a7bb152e2252b53fa7803150007879548bc709c039df7627cabbd05d469"
SRC_URI[windows_aarch64_msvc-0.53.1.sha256sum] = "b9d782e804c2f632e395708e99a94275910eb9100b2114651e04744e9b125006"
SRC_URI[windows_i686_gnu-0.48.5.sha256sum] = "a75915e7def60c94dcef72200b9a8e58e5091744960da64ec734a6c6e9b3743e"
SRC_URI[windows_i686_gnu-0.52.6.sha256sum] = "8e9b5ad5ab802e97eb8e295ac6720e509ee4c243f69d781394014ebfe8bbfa0b"
SRC_URI[windows_i686_gnu-0.53.1.sha256sum] = "960e6da069d81e09becb0ca57a65220ddff016ff2d6af6a223cf372a506593a3"
SRC_URI[windows_i686_gnullvm-0.52.6.sha256sum] = "0eee52d38c090b3caa76c563b86c3a4bd71ef1a819287c19d586d7334ae8ed66"
SRC_URI[windows_i686_gnullvm-0.53.1.sha256sum] = "fa7359d10048f68ab8b09fa71c3daccfb0e9b559aed648a8f95469c27057180c"
SRC_URI[windows_i686_msvc-0.48.5.sha256sum] = "8f55c233f70c4b27f66c523580f78f1004e8b5a8b659e05a4eb49d4166cca406"
SRC_URI[windows_i686_msvc-0.52.6.sha256sum] = "240948bc05c5e7c6dabba28bf89d89ffce3e303022809e73deaefe4f6ec56c66"
SRC_URI[windows_i686_msvc-0.53.1.sha256sum] = "1e7ac75179f18232fe9c285163565a57ef8d3c89254a30685b57d83a38d326c2"
SRC_URI[windows_x86_64_gnu-0.48.5.sha256sum] = "53d40abd2583d23e4718fddf1ebec84dbff8381c07cae67ff7768bbf19c6718e"
SRC_URI[windows_x86_64_gnu-0.52.6.sha256sum] = "147a5c80aabfbf0c7d901cb5895d1de30ef2907eb21fbbab29ca94c5b08b1a78"
SRC_URI[windows_x86_64_gnu-0.53.1.sha256sum] = "9c3842cdd74a865a8066ab39c8a7a473c0778a3f29370b5fd6b4b9aa7df4a499"
SRC_URI[windows_x86_64_gnullvm-0.48.5.sha256sum] = "0b7b52767868a23d5bab768e390dc5f5c55825b6d30b86c844ff2dc7414044cc"
SRC_URI[windows_x86_64_gnullvm-0.52.6.sha256sum] = "24d5b23dc417412679681396f2b49f3de8c1473deb516bd34410872eff51ed0d"
SRC_URI[windows_x86_64_gnullvm-0.53.1.sha256sum] = "0ffa179e2d07eee8ad8f57493436566c7cc30ac536a3379fdf008f47f6bb7ae1"
SRC_URI[windows_x86_64_msvc-0.48.5.sha256sum] = "ed94fce61571a4006852b7389a063ab983c02eb1bb37b47f8272ce92d06d9538"
SRC_URI[windows_x86_64_msvc-0.52.6.sha256sum] = "589f6da84c646204747d1270a2a5661ea66ed1cced2631d546fdfb155959f9ec"
SRC_URI[windows_x86_64_msvc-0.53.1.sha256sum] = "d6bbff5f0aada427a1e5a6da5f1f98158182f26556f345ac9e04d36d0ebed650"
SRC_URI[winnow-0.7.13.sha256sum] = "21a0236b59786fed61e2a80582dd500fe61f18b5dca67a4a067d0bc9039339cf"
SRC_URI[wit-bindgen-0.46.0.sha256sum] = "f17a85883d4e6d00e8a97c586de764dabcc06133f7f1d55dce5cdc070ad7fe59"
SRC_URI[writeable-0.6.2.sha256sum] = "9edde0db4769d2dc68579893f2306b26c6ecfbe0ef499b013d731b7b9247e0b9"
SRC_URI[yansi-1.0.1.sha256sum] = "cfe53a6657fd280eaa890a3bc59152892ffa3e30101319d168b781ed6529b049"
SRC_URI[yoke-0.8.1.sha256sum] = "72d6e5c6afb84d73944e5cedb052c4680d5657337201555f9f2a16b7406d4954"
SRC_URI[yoke-derive-0.8.1.sha256sum] = "b659052874eb698efe5b9e8cf382204678a0086ebf46982b79d6ca3182927e5d"
SRC_URI[zerocopy-0.8.27.sha256sum] = "0894878a5fa3edfd6da3f88c4805f4c8558e2b996227a3d864f47fe11e38282c"
SRC_URI[zerocopy-derive-0.8.27.sha256sum] = "88d2b8d9c68ad2b9e4340d7832716a4d21a22a1154777ad56ea55c51a9cf3831"
SRC_URI[zerofrom-0.1.6.sha256sum] = "50cc42e0333e05660c3587f3bf9d0478688e15d870fab3346451ce7f8c9fbea5"
SRC_URI[zerofrom-derive-0.1.6.sha256sum] = "d71e5d6e06ab090c67b5e44993ec16b72dcbaabc526db883a360057678b48502"
SRC_URI[zeroize-1.8.2.sha256sum] = "b97154e67e32c85465826e8bcc1c59429aaaf107c1e4a9e53c8d8ccd5eff88d0"
SRC_URI[zerotrie-0.2.3.sha256sum] = "2a59c17a5562d507e4b54960e8569ebee33bee890c70aa3fe7b97e85a9fd7851"
SRC_URI[zerovec-0.11.5.sha256sum] = "6c28719294829477f525be0186d13efa9a3c602f7ec202ca9e353d310fb9a002"
SRC_URI[zerovec-derive-0.11.2.sha256sum] = "eadce39539ca5cb3985590102671f2567e659fca9666581ad3411d59207951f3"

SRCREV = "${AUTOREV}"
PV = "0.9.0+git${SRCREV}"
