FROM openjdk:11-jre-slim-stretch

# Install dependencies
RUN apt-get update && \
    apt-get install -y curl unzip && \
    rm -rf /var/lib/apt/lists/*

# Install Android SDK
ARG ANDROID_SDK_VERSION=7583922
ENV ANDROID_HOME /opt/android-sdk
ENV PATH $ANDROID_HOME/emulator:$ANDROID_HOME/tools/bin:$ANDROID_HOME/platform-tools:$PATH
RUN mkdir -p $ANDROID_HOME && \
    curl -sS https://dl.google.com/android/repository/commandlinetools-linux-${ANDROID_SDK_VERSION}_latest.zip -o /tmp/android.zip && \
    unzip -qq /tmp/android.zip -d $ANDROID_HOME && \
    rm /tmp/android.zip
#RUN yes | sdkmanager --licenses

# Create and start emulator
ARG EMULATOR_API_LEVEL
ARG EMULATOR_NAME