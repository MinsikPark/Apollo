package com.apollo.task.dao;



import java.util.List;
import java.util.Map;

import com.apollo.vo.CommentDTO;

public interface CommentDAO {
	
	public int insertComment(CommentDTO commentdto);
	
	public List<String> selectCommentMidlist(int pid);

	public int insertReceiver(Map map);
}
