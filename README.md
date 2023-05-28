# ArtTeleport
![Скачиваний](https://img.shields.io/github/downloads/FurnyGo/ArtTeleport/total?color=red&logo=github&style=for-the-badge)  
v2.3 - 1.19.3+  
  
  
СКАЧАТЬ - [ТЫК](https://github.com/FurnyGo/ArtTeleport/releases/download/v2.3/arttp-2.3.jar)  
DOWNLOAD - [CLICK](https://github.com/FurnyGo/ArtTeleport/releases/download/v2.3/arttp-2.3.jar)

## Установка / Downloading

### EN:
1. Download this mod [here](https://github.com/FurnyGo/ArtTeleport/releases/download/v2.3/arttp-2.3.jar), download [oωo-lib](https://modrinth.com/mod/owo-lib), [Fabric API](https://modrinth.com/mod/fabric-api) и [ModMenu](https://modrinth.com/mod/modmenu)  
2. Choose Fabric 1.19.4 (or Fabric 1.19.3) version in your launcher
3. In the minecraft folder (`WIN+R -> %appdata%`), throw these mods into the `mods` folder (Create a folder if there is none)
4. Start the Minecraft, see the guide from below and configure the necessary coordinates in the mod config via ModMenu

### RU:
1. Качаете мод [тут](https://github.com/FurnyGo/ArtTeleport/releases/download/v2.3/arttp-2.3.jar), скачиваете [oωo-lib](https://modrinth.com/mod/owo-lib), [Fabric API](https://modrinth.com/mod/fabric-api) и [ModMenu](https://modrinth.com/mod/modmenu)  
2. Выбираете в своём лаунчере версию Fabric 1.19.4 (либо Fabric 1.19.3)  
3. В папке майнкрафта (`WIN+R -> %appdata%`) кидаете эти моды в папку `mods` (Создайте папку, если её нет)  
4. Запускаете майнкрафт, смотрите гайд снизу и настраиваете нужные координаты в конфиге мода через ModMenu  

## Подробный гайд / Detailed guide
[![Guide](https://img.youtube.com/vi/LgUyZ-xPvmQ/hqdefault.jpg)](https://youtu.be/LgUyZ-xPvmQ)
## Гайд на постоянный EasyPlace / Guide to the permanent EasyPlace
### EN:
In order not to hold the right mouse button manually, there is such a way:
1. Close minecraft and open the file `.minecraft/config/litematica.json`, find `easyPlaceUseKey` and replace with 
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
3. Save the file  
4. Now you will have this function working when you turn it on via the specified key in `easyPlaceToggle` (`M button -> Configuration Menu -> Hotkeys`)  

### RU: 
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
4. Теперь у вас будет работать эта функция, когда вы включаете его через заданную клавишу в `easyPlaceToggle` (`Кнопка Ь -> Настройки -> Клавиши`)  

### Принцип работы наглядно / The principle of operation is clearly

Телепорты с серверной стороны (/tp и /tppos) / Teleports from the server side (/tp and /tppos):  
![image](https://user-images.githubusercontent.com/68079109/224092446-659836d1-a40e-481c-982f-c7bac9ff6a52.png)  
  
Телепорты с клиента / Teleports from the client:  
![image](https://github.com/FurnyGo/ArtTeleport/assets/68079109/3cc1949c-aa16-4be9-a0d8-f7f9c7809e3e)  
