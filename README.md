# SeleniumCucumberMaven with dockerFilE
sudo: required

language: java

services:
  - docker

before_install:
- docker build . dockerTest
script:
- docker run dockerTest
