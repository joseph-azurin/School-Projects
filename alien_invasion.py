import pygame
import random
import math

# Initialize
pygame.init()

screen = pygame.display.set_mode((1200, 800))

pygame.display.set_caption("Alien Invasion")
icon = pygame.image.load('rocket.png')
pygame.display.set_icon(icon)

playerimage = pygame.image.load('space-invaders.png')
playerx = 750
playery = 580
playerx_change = 0

alienimage = []
alienx = []
alieny = []
alienx_change = []
alieny_change = []
num_of_aliens = 6

for i in range(num_of_aliens):
    alienimage.append(pygame.image.load('ufo.png'))
    alienx.append(random.randint(0,736))
    alieny.append(random.randint(50,150))
    alienx_change.append(4)
    alieny_change.append(40)

bulletimage = pygame.image.load('bullet.png')
bulletx = 0
bullety = 480
bulletx_change = 0
bullety_change = 10
bullet_state = "ready"

score_value= 0
font = pygame.font.Font('freesansbold.ttf',32)

testx = 10
testy = 10

gameover = pygame.font.Font('freesansbold.ttf',64)

def show_score(x, y):
    score = font.render("Score : " + str(score_value), True, (255, 255, 255))
    screen.blit(score, (x, y))

def game_over_text():
    over_text = gameover.render("GAME OVER", True, (255, 255, 255))
    screen.blit(gameover, (200, 250))


def player(x, y, ):
    screen.blit(playerimage, (x, y))


def alien(x, y, i ):
    screen.blit(alienimage[i], (x, y))


def fire_bullet(x, y):
    global bullet_state
    bullet_state = "fire"
    screen.blit(bulletimage, (x + 16, y + 10))


def isCollision(alienx, alieny, bulletx, bullety):
    distance = math.sqrt(math.pow(alienx - bulletx,2)+ (math.pow(alieny - bullety, 2)))
    if distance < 27:
        return True
    else:
        return False


running = True
while running:

    screen.fill((0, 0, 0))

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_LEFT:
                playerx_change = -5
            if event.key == pygame.K_RIGHT:
                playerx_change = 5
            if event.key == pygame.K_SPACE:
                if bullet_state is "ready":
                    bulletx = playerx
                    fire_bullet(playerx, bullety)

        if event.type == pygame.KEYUP:
            if event.key == pygame.K_LEFT or event.key == pygame.K_RIGHT:
                playerx_change = 0



    playerx += playerx_change
    if playerx <= 0:
        playerx = 0
    elif playerx >= 736:
        playerx = 736

    for i in range(num_of_aliens):


        if alieny[i] > 440:
            for j in range(num_of_aliens):
                alieny[j] = 2000
            game_over_text()
            break


    alienx[i] += alienx_change[i]
    if alienx[i] <= 0:
        alienx_change[i] = 4
        alieny[i]  += alieny_change[i]
    elif alienx[i]  >= 736:
        alienx_change[i]  = -4
        alieny[i]  += alieny_change[i]

    collision = isCollision(alienx[i] , alieny[i] , bulletx, bullety)
    if collision:
        bullety = 480
        bulletx = "ready"
        score_value += 1
        alienx[i]  = random.randint(0, 800)
        alieny[i]  = random.randint(50, 150)

    alien(alienx[i], alieny[i], i)

    if bullety <= 0:
        bullety = 480
        bullet_state = "ready"

    if bullet_state is "fire":
        fire_bullet(bulletx, bullety)
        bullety -= bullety_change






    player(playerx, playery)
    show_score(testx,testy)
    pygame.display.update()
