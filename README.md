# ArtTeleport
![Скачиваний](https://img.shields.io/github/downloads/FurnyGo/ArtTeleport/total?color=red&logo=github&style=for-the-badge)  
v2.2 - 1.19.3+  
  
  
СКАЧАТЬ - [ТЫК](https://github.com/FurnyGo/ArtTeleport/releases/download/v2.2/arttp-2.2.1.jar)

## Установка
1. Качаете мод [тут](https://github.com/FurnyGo/ArtTeleport/releases/download/v2.2/arttp-2.2.1.jar), скачиваете [oωo-lib](https://modrinth.com/mod/owo-lib), [Fabric API](https://modrinth.com/mod/fabric-api) и [ModMenu](https://modrinth.com/mod/modmenu)  
2. Выбираете в своём лаунчере версию Fabric 1.19.4 (либо Fabric 1.19.3)  
3. В папке майнкрафта (`WIN+R -> %appdata%`) кидаете эти моды в папку `mods` (Создайте папку, если её нет)  
4. Запускаете майн, смотрите гайд снизу и настраиваете нужные координаты в конфиге мода через ModMenu  


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
4. Теперь у вас будет работать эта функция, когда вы включаете его через заданную клавишу в easyPlaceToggle (Кнопка Ь -> Настройки -> Клавиши)  

Постоянно лететь можно через любой мод с Auto Walk  
  
### Принцип работы наглядно

Телепорты с серверной стороны (/tp и /tppos):  
![image](https://user-images.githubusercontent.com/68079109/224092446-659836d1-a40e-481c-982f-c7bac9ff6a52.png)  
  
Телепорты с клиента:  
![image](https://github.com/FurnyGo/ArtTeleport/assets/68079109/3cc1949c-aa16-4be9-a0d8-f7f9c7809e3e)  
