font = pygame.font.Font('freesansbold.ttf',32)
pygame.display.set_caption("Alien Invasion")
icon = pygame.image.load('rocket.png')
pygame.display.set_icon(icon)
testx = 10
testy = 10
def game_over_text():
    over_text = gameover.render("GAME OVER", True, (255, 255, 255))
    screen.blit(gameover, (200, 250))
collision = isCollision(alienx[i] , alieny[i] , bulletx, bullety)
    if collision:
        bullety = 480
        bulletx = "ready"
        score_value += 1
        alienx[i]  = random.randint(0, 800)
        alieny[i]  = random.randint(50, 150)
alien(alienx[i], alieny[i], i)
player(playerx, playery)
show_score(testx, testy)
pygame.display.update()
