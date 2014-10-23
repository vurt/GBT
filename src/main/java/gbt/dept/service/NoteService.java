package gbt.dept.service;

import java.sql.Timestamp;

import gbt.dept.DepartmentNote;

public class NoteService {
	public DepartmentNote initNote(DepartmentNote note) {
		note.setCreatedAt(new Timestamp(System.currentTimeMillis()));
		note.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
		note.setCreatedBy(123123);
		note.setUpdatedBy(123);
		return note;
	}
}
