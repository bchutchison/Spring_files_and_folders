package com.codeclan.filesandfolders;

import com.codeclan.filesandfolders.repository.FileRepository;
import com.codeclan.filesandfolders.repository.FolderRepository;
import com.codeclan.filesandfolders.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesandfoldersApplicationTests {

	@Autowired
    FolderRepository folderRepository;

	@Autowired
    UserRepository userRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

}
