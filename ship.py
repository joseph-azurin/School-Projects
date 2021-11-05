playerimage = pygame.image.load('space-invaders.png')
playerx = 750
playery = 580
playerx_change = 0
def player(x, y, ):
    screen.blit(playerimage, (x, y))
 playerx += playerx_change
    if playerx <= 0:
        playerx = 0
    elif playerx >= 736:
        playerx = 736
