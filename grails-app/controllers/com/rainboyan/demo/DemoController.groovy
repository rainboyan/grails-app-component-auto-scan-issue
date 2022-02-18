package com.rainboyan.demo

class DemoController {
    def demoBean

    def index() {
        render demoBean.name
    }
}