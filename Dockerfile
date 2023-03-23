FROM eclipse-temurin:17

# install dependencies
RUN apt-get update && apt-get install -y \
    maven \
    && rm -rf /var/lib/apt/lists/*

# set working directory
WORKDIR /app

# copy source code
COPY pom.xml .

# download dependencies
RUN mvn dependency:go-offline

# copy source code
COPY . .

# build project \
RUN mvn package