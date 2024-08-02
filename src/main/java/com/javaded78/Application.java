package com.javaded78;

import com.javaded78.controller.Controller;
import com.javaded78.controller.DispatcherController;

import java.io.IOException;

public class Application {
    public static void main(final String[] args) {

        Controller dispatcherController = DispatcherController.getInstance();
        dispatcherController.dispatch(args);
    }
}