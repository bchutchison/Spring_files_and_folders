package com.codeclan.filesandfolders.repository;

import com.codeclan.filesandfolders.models.Folder;
import com.codeclan.filesandfolders.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
