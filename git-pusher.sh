#!/usr/bin/env bash

git add -A; git commit -m "$*"; git push github master; git push gitlab master
