## TDD Exo 1

Implémenter une fonctionnalité de recherche de ville. La méthode prend une string (texte de recherche) en entrée et renvoie les villes correspondant au texte de recherche.

Exemples de ville : Paris, Budapest, Skopje, Rotterdam, Valence, Vancouver, Amsterdam, Vienne, Sydney, New York, Londres, Bangkok, Hong Kong, Dubaï, Rome, Istanbul

Etapes du projet:
1. Si le texte de la recherche contient moins de 2 caractères, une exception est levée de type ***NotFoundException***.
2. Si le texte de recherche est égal ou supérieur à 2 caractères, il doit renvoyer tous les noms de ville commençant par le texte de recherche exact. Par exemple, pour le texte de recherche "Va", la fonction doit renvoyer Valence et Vancouver.
3. La fonctionnalité de recherche doit être insensible à la casse.
4. La fonctionnalité de recherche doit également fonctionner lorsque le texte de recherche n'est qu'une partie d'un nom de ville. Par exemple "ape" devrait renvoyer la ville "Budapest"
5. Si le texte de recherche est un « * » (astérisque), il doit renvoyer tous les noms de ville.

Vous devez développer en appliquant les principes du TDD et étape par étape.

```java
public class TownSearch {
   private List<String> towns;
   
   public List<String> search(String criteria)  {
      throw new NotImplementedException();
   }
}
```
