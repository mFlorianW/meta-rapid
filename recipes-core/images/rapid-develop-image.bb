SUMMARY = "A image that contains rapid and start it automatically, with packages for development"

require rapid-image.bb

IMAGE_FEATURES += " \
    allow-empty-password \
    allow-root-login \
    ssh-server-openssh \
    tools-debug \
"

