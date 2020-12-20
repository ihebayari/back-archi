package com.example.universirte.archlog.services;

import com.example.universirte.archlog.entities.*;
import java.util.List;
import java.util.Optional;
public interface universityInterface {
    void saveuniv(University u);
    void Updateuniv(University u);
    List<University> Listuniv();
    void removeuniv(Long Id);
    Optional<University> findun(Long Id);
}
