package com.example.projetoparaestudo.services;

import com.example.projetoparaestudo.model.Cachorro;
import com.example.projetoparaestudo.model.enums.Sexo;
import com.example.projetoparaestudo.model.enums.StatusAnimal;
import com.example.projetoparaestudo.repositories.CachorroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {
    @Autowired
    private CachorroRepository cachorroRepository;

    public void instanciaDB(){
        Cachorro cahorro1 = new Cachorro(null, "https://portalvet.royalcanin.com.br/media/wp-content/uploads/2024/04/pastor-alemao-deitado.jpg", "Boris", 7, 16.2, Sexo.MACHO, StatusAnimal.DISPONIVEL, "Pastor Alemão", true);

        Cachorro cahorro2 = new Cachorro(null, "https://www.petlove.com.br/images/breeds/193223/profile/original/golden_retriever-p.jpg?1532539102", "Max", 3, 12.0, Sexo.MACHO, StatusAnimal.DISPONIVEL, "Golden Retriever", true);

        Cachorro cahorro3 = new Cachorro(null, "https://www.petz.com.br/blog/wp-content/uploads/2021/03/nomes-para-cachorro-poodle1.jpg", "Bela", 2, 14.0, Sexo.FEMEA, StatusAnimal.PROCESSO, "Poodle Toy", false);

        Cachorro cahorro4 = new Cachorro(null, "https://blog.polipet.com.br/wp-content/uploads/2022/08/AdobeStock_100800827-scaled.jpeg", "Thor", 5, 17.0, Sexo.MACHO, StatusAnimal.ADOTADO, "Husky Siberiano", true);

        Cachorro cahorro5 = new Cachorro(null, "https://p2.trrsf.com/image/fget/cf/774/0/images.terra.com/2023/10/09/1395947931-salsicha.jpg", "Mel", 4, 10.0, Sexo.FEMEA, StatusAnimal.ADOTADO, "Dachushund Salsicha", true);

        Cachorro cahorro6 = new Cachorro(null, "https://www.petlove.com.br/images/breeds/193219/profile/original/labrador-p.jpg?1532539172", "Simba", 6, 16.2, Sexo.MACHO, StatusAnimal.DISPONIVEL, "Labrador Retriever", false);

        Cachorro cahorro7 = new Cachorro(null, "https://i.pinimg.com/474x/de/e4/94/dee494208dde46cbc1cf21fbbd1e8fa9.jpg", "Luna", 1, 12.2, Sexo.FEMEA, StatusAnimal.ADOTADO, "Shih Tzu", true);

        cachorroRepository.saveAll(Arrays.asList(cahorro1, cahorro2, cahorro3, cahorro4, cahorro5, cahorro6, cahorro7));
    }
}
