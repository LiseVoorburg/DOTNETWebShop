
-- --------------------------------------------------
-- Entity Designer DDL Script for SQL Server 2005, 2008, 2012 and Azure
-- --------------------------------------------------
-- Date Created: 06/07/2018 15:07:10
-- Generated from EDMX file: C:\Users\koenfischer\Source\Repos\DOTNETWebShop\WcfWebShopLibrary1\Model1.edmx
-- --------------------------------------------------

SET QUOTED_IDENTIFIER OFF;
GO
USE [Mysql];
GO
IF SCHEMA_ID(N'dbo') IS NULL EXECUTE(N'CREATE SCHEMA [dbo]');
GO

-- --------------------------------------------------
-- Dropping existing FOREIGN KEY constraints
-- --------------------------------------------------


-- --------------------------------------------------
-- Dropping existing tables
-- --------------------------------------------------


-- --------------------------------------------------
-- Creating all tables
-- --------------------------------------------------

-- Creating table 'gebruikers1'
CREATE TABLE [dbo].[gebruiker] (
    [naam] nvarchar(max)  NOT NULL,
    [wachtwoord] nvarchar(max)  NOT NULL,
    [saldo] float  NOT NULL
);
GO

-- Creating table 'orders'
CREATE TABLE [dbo].[order] (
    [Id] int  NOT NULL,
    [aantal] int  NOT NULL,
    [product_naam] nvarchar(max)  NOT NULL,
    [gebruiker_naam1] nvarchar(max)  NOT NULL
);
GO

-- Creating table 'products'
CREATE TABLE [dbo].[product] (
    [naam] nvarchar(max)  NOT NULL,
    [prijs] float  NOT NULL,
    [aantal] int  NOT NULL,
    [order_Id] int  NOT NULL
);
GO

-- --------------------------------------------------
-- Creating all PRIMARY KEY constraints
-- --------------------------------------------------

-- Creating primary key on [naam] in table 'gebruikers1'
ALTER TABLE [dbo].[gebruiker]
ADD CONSTRAINT [PK_gebruiker]
    PRIMARY KEY CLUSTERED ([naam] ASC);
GO

-- Creating primary key on [Id] in table 'orders'
ALTER TABLE [dbo].[order]
ADD CONSTRAINT [PK_order]
    PRIMARY KEY CLUSTERED ([Id] ASC);
GO

-- Creating primary key on [naam] in table 'products'
ALTER TABLE [dbo].[product]
ADD CONSTRAINT [PK_product]
    PRIMARY KEY CLUSTERED ([naam] ASC);
GO

-- --------------------------------------------------
-- Creating all FOREIGN KEY constraints
-- --------------------------------------------------

-- Creating foreign key on [gebruiker_naam1] in table 'orders'
ALTER TABLE [dbo].[order]
ADD CONSTRAINT [FK_gebruikerorder]
    FOREIGN KEY ([gebruiker_naam1])
    REFERENCES [dbo].[gebruiker]
        ([naam])
    ON DELETE NO ACTION ON UPDATE NO ACTION;
GO

-- Creating non-clustered index for FOREIGN KEY 'FK_gebruikerorder'
CREATE INDEX [IX_FK_gebruikerorder]
ON [dbo].[order]
    ([gebruiker_naam1]);
GO

-- Creating foreign key on [order_Id] in table 'products'
ALTER TABLE [dbo].[product]
ADD CONSTRAINT [FK_orderproduct]
    FOREIGN KEY ([order_Id])
    REFERENCES [dbo].[order]
        ([Id])
    ON DELETE NO ACTION ON UPDATE NO ACTION;
GO

-- Creating non-clustered index for FOREIGN KEY 'FK_orderproduct'
CREATE INDEX [IX_FK_orderproduct]
ON [dbo].[product]
    ([order_Id]);
GO

-- --------------------------------------------------
-- Script has ended
-- --------------------------------------------------