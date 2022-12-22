import { Component } from '@angular/core';

@Component({
  selector: 'app-fotos',
  templateUrl: './fotos.component.html',
  styleUrls: ['./fotos.component.css']
})
export class FotosComponent {

  arrayFotos: any = [
    {
      url: "https://static.wikia.nocookie.net/yugioh/images/6/65/ChangeofHeart-MAMA-EN-UR-1E.png",
      description: "Target 1 monster your opponent controls; take control of it until the End Phase."
    },
    {
      url: "https://static.wikia.nocookie.net/yugioh/images/a/a3/MysticalElf-SBAD-EN-C-1E.png",
      description: "A delicate elf that lacks offense, but has a terrific defense backed by mystical power."
    },
    {
      url: "https://static.wikia.nocookie.net/yugioh/images/8/87/MagicCylinder-SDMY-EN-C-1E.png",
      description: "When an opponent's monster declares an attack: Target the attacking monster; negate the attack, and if you do, inflict damage to your opponent equal to its ATK."
    },
    {
      url: "https://static.wikia.nocookie.net/yugioh/images/7/76/HouseDragonmaid-MAGO-EN-PGR-1E.png",
      description: "1 'Dragonmaid' monster + 1 Dragon monster \nOnce per turn, during the Standby Phase: You can target 1 other 'Dragonmaid' monster you control; Special Summon 1 'Dragonmaid' monster from your hand or GY in Defense Position, whose Level is 1 higher or 1 lower than it. When another face-up Dragon monster(s) you control returns to your hand (except during the Damage Step): You can target 1 monster your opponent controls; destroy it."
    },
    {
      url: "https://static.wikia.nocookie.net/yugioh/images/6/6e/SilentMagician-DPRP-EN-UR-1E.png",
      description: ".........."
    }
  ]


}
