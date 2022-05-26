# Getting Started

## Environments Variables:

* MAIL_SENDER_HOST
* MAIL_SENDER_PORT
* MAIL_SENDER_USERNAME
* MAIL_SENDER_PASSWORD
* MAIL_SENDER_PROTOCOL
* MAIL_SENDER_AUTH
* MAIL_SENDER_STARTTLS_ENABLE
* MAIL_SENDER_DEBUG

## Running

### Building image 
    docker build --tag {{tagname}} .

### docker run
    docker run \ 
        -e MAIL_SENDER_HOST={{host}} \
        -e MAIL_SENDER_PORT={{port}} \
        -e MAIL_SENDER_USERNAME={{username}} \
        -e MAIL_SENDER_PASSWORD={{password}} \
        -e MAIL_SENDER_PROTOCOL={{protocol}} \
        -e MAIL_SENDER_AUTH={{needs_auth}} \
        -e MAIL_SENDER_STARTTLS_ENABLE={{tls_enable}} \
        -e MAIL_SENDER_DEBUG={{debug_enable}} \
        -p 8080:8080 {{tagname}} 

### docker compose

    docker-compose up
####
    version: '3'
    services:
      email-service:
        image: economiza/e-conomiza:nginx
        ports:
          - 8080:8080
        environment:
          - MAIL_SENDER_HOST={{host}}
          - MAIL_SENDER_PORT={{port}}
          - MAIL_SENDER_USERNAME={{username}}
          - MAIL_SENDER_PASSWORD={{password}}
          - MAIL_SENDER_PROTOCOL={{protocol}}
          - MAIL_SENDER_AUTH={{needs_auth}}
          - MAIL_SENDER_STARTTLS_ENABLE={{tls_enable}}
          - MAIL_SENDER_DEBUG={{debug_enable}}

