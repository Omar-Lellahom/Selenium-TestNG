package com.todos.tests;


import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.Setup;

public class AddTodoTest extends Setup {

	public AddTodoTest() throws IOException {
		super();
	
	}
	TodoPage todoPage ;
	
	@Test(priority = 1)
	public void icanAddToDo() throws IOException {
		todoPage = new TodoPage();
		Boolean todoField =  todoPage.isElementDisplayed(todoPage.inputText);
		Assert.assertTrue(todoField);
		todoPage.submitToDo(prop.getProperty("home.todo1"));
		String elementTodo = todoPage.checkElementContain(todoPage.todoText);
		Assert.assertTrue(elementTodo.contains(prop.getProperty("home.todo1")));
		Boolean cheked = todoPage.isChecboxElement(todoPage.checkbox);
		Assert.assertFalse(cheked);
		
	}

}
