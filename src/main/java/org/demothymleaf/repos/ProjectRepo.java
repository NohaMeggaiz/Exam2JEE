package org.demothymleaf.repos;

import org.demothymleaf.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo  extends JpaRepository<Project, Long> {
}
