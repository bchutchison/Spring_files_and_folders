package com.codeclan.filesandfolders.components;

import com.codeclan.filesandfolders.models.File;
import com.codeclan.filesandfolders.models.Folder;
import com.codeclan.filesandfolders.models.User;
import com.codeclan.filesandfolders.repository.FileRepository;
import com.codeclan.filesandfolders.repository.FolderRepository;
import com.codeclan.filesandfolders.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    public void run(ApplicationArguments args) {

        User user1 = new User("Dot");
        userRepository.save(user1);

        User user2 = new User("Dave");
        userRepository.save(user2);

        User user3 = new User("Dorris");
        userRepository.save(user3);

        User user4 = new User("Dee");
        userRepository.save(user4);


        Folder folder1 = new Folder( "A", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder( "B", user1);
        folderRepository.save(folder2);


        File file1 = new File("1", "jpg", 23, folder1 );
        fileRepository.save(file1);

        File file2 = new File("2", "jpg", 32, folder1 );
        fileRepository.save(file2);


    }

}
