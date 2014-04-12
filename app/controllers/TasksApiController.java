package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.Task;
import play.libs.Json;
import play.mvc.Result;

import java.util.List;

import static play.mvc.Results.ok;

/**
 * Created by Timo on 4/5/14.
 */
public class TasksApiController {

    public static Result allTasks(x){
        List<Task> tasks = Task.all();
        JsonNode jsonNode = Json.toJson(tasks);
        return ok(jsonNode);
    }

    public static  Result getTask(Long taskId){
        Task task = Task.getById(taskId);
        JsonNode jsonNode = Json.toJson(task);
        return ok(jsonNode);

    }
}
