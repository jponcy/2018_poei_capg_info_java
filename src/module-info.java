/**
 * Avant tout dev, il faudra faire (ou mettre à jour) une analyse UML.
 * 
 * 1) Nous devons gérer des personnages ainsi que leur équipement. Ils peuvent avoir :
 * - un casque/chapeau
 * - des gants
 * - une arme (une main ou deux main -- si on possède une arme deux mains, on ne peut pas équiper une deuxième arme
 *      secondaire comme les dagues et les boucliers)
 * - bottes
 * - plastron
 * 
 * Certains stuff sont spécifique pour une classe de personnage peuvent utiliser les
 * - sorciers (magique) : sceptres maudits
 * - mages (magique) : baguettes de fée
 * - clerc (magique) : marteau 1 main, boucliers, sceptres maudits enchanté purificateur, marteaux deux mains
 * - gladiateur (physique) : épée 1 main, marteau 2 mains, bouclier
 * - paladin  (magique) : épée 1 main, bouclier, marteau 2 mains
 * - oracle (magique) : pas d'équipements
 * - assassin (physique) : épée une main + dague
 * - traqueur (physique) : arc + dague
 * - chasseur (physique) : dague
 * - apprenti (magique) : baton magique
 * - necromencier (magique) : sceptres maudits
 * 
 * On ne s'interesse actuellement qu'à la fiche du personnage avec ses équipements possédés/équipés.
 * On ne pourra pas équiper un équipement au mauvais endroit (pas de bottes sur la tête, ...).
 */
module tp_rpg {
}
