
import mouse
import keyboard

# import pyautogui
# pyautogui contains the functions .write .keyDown .keyUp 
# keyUp & keyDown are used to toggle keys that need to work in conjunction with others such as:
# ctrl, shift, & alt

import time
import pyautogui

def sentence(message):
    time.sleep(3)
    pyautogui.write(message)


sentence("Thats all she wrote")


