FROM eclipse-temurin:17.0.6_10-jdk

ARG USERNAME=vscode
ARG USER_UID=1000
ARG USER_GID=$USER_UID

SHELL ["/bin/bash", "-c"]

RUN groupadd --gid $USER_GID $USERNAME \
    && useradd --uid $USER_UID --shell /bin/bash --gid $USER_GID -m $USERNAME \
    && apt update \
    && apt install -y zip sudo \
    && echo $USERNAME ALL=\(root\) NOPASSWD:ALL > /etc/sudoers.d/$USERNAME \
    && chmod 0440 /etc/sudoers.d/$USERNAME

RUN su $USERNAME -c \
    'curl -s "https://get.sdkman.io" | bash \
    && source "${HOME}/.sdkman/bin/sdkman-init.sh" \
    && sdk install gradle'

USER $USERNAME