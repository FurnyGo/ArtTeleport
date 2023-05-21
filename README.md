# ArtTeleport
![Скачиваний](https://img.shields.io/github/downloads/FurnyGo/ArtTeleport/total?color=red&logo=github&style=for-the-badge)  
v2.1 - 1.19.3+  
  
  
СКАЧАТЬ - [ТЫК](https://github.com/FurnyGo/ArtTeleport/releases/download/v2.1/arttp-2.1.jar)

## Доп. моды

v2.1 - [oωo-lib](https://modrinth.com/mod/owo-lib), [ModMenu](https://modrinth.com/mod/modmenu)  

## Как это работает?
Используется система EasyPlace в стандартной лайтматике, вам нужно просто зажать ПКМ, смотреть на восток и лететь прямо.  
Чтобы не зажимать ПКМ вручную существует такой способ:  
1. Закройте майнкрафт и откройте файл `.minecraft/config/litematica.json`, найдите `easyPlaceUseKey` и замените на  
```
"easyPlaceUseKey": {
      "keys": "",
      "settings": {
        "activate_on": "PRESS",
        "context": "INGAME",
        "allow_empty": true,
        "allow_extra_keys": true,
        "order_sensitive": true,
        "exclusive": false,
        "cancel": true
      }
    },
```  
3. Сохраните файл  
4. Теперь у вас будет работать эта функция, когда вы включаете его через заданную клавишу в easyPlaceToggle
Постоянно лететь вперёд можно через любой мод с Auto Walk  
  
### Принцип работы наглядно:
![image](https://user-images.githubusercontent.com/68079109/224092446-659836d1-a40e-481c-982f-c7bac9ff6a52.png)  
