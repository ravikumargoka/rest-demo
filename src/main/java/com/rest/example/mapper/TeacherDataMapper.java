package com.rest.example.mapper;

import com.rest.example.dto.TeacherDTO;
import com.rest.example.entity.Teacher;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TeacherDataMapper {

    TeacherDataMapper INSTANCE = Mappers.getMapper(TeacherDataMapper.class);

    TeacherDTO mapToTeacherDTO(Teacher teacher);

    List<TeacherDTO> mapToTeacherDTOList(List<Teacher> teachers);

    Teacher mapToTeacher(TeacherDTO teacherDTO);

    List<Teacher> mapToTeacherList(List<TeacherDTO> teacherDTO);
}
