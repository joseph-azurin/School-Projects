bulletimage = pygame.image.load('bullet.png')
bulletx = 0
bullety = 480
bulletx_change = 0
bullety_change = 10
bullet_state = "ready"
def fire_bullet(x, y):
    global bullet_state
    bullet_state = "fire"
    screen.blit(bulletimage, (x + 16, y + 10)
 if bullety <= 0:
        bullety = 480
        bullet_state = "ready"

    if bullet_state is "fire":
        fire_bullet(bulletx, bullety)
        bullety -= bullety_change