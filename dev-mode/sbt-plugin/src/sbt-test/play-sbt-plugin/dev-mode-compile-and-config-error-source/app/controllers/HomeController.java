/*
 * Copyright (C) from 2022 The Play Framework Contributors <https://github.com/playframework>, 2011-2021 Lightbend Inc. <https://www.lightbend.com>
 */

package controllers;

import javax.inject.Inject;

import modules.SomeComponent;

import play.mvc.Controller;
import play.mvc.Result;

public class HomeController extends Controller {

    @Inject
    public HomeController(final SomeComponent someComponent) { }

    public Result index() {
        return ok("app compiles and runs!");
    }
}
