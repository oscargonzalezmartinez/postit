package org.ogm.postit.test.data;

import org.ogm.postit.api.model.Postit;
import org.ogm.postit.api.model.Project;

public class PostitFactory {

	public static Postit newPostit(){
		Postit postit = new Postit();
		//1,1,1,'Título 1-1','Esto es el texto completo','#ffaabb'
		postit.setId(1L);
		postit.setUserId(1L);
		Project project = new Project();
		project.setId(1l);
		postit.setProject(project);
		postit.setTitle("Titulo 1-1");
		postit.setText("Esto es el texto completo");
		postit.setColor("#ffaabb");

		return postit;
	}
}
